# Stage 1: Build the application using Gradle
FROM gradle:8.8-jdk17-alpine AS builder
# gradle:8.8-jdk17-alpine uses Gradle 8.8 with JDK 17 on an Alpine base.
# Adjust Gradle/JDK version if needed, but this matches your Java 17 requirement.

WORKDIR /app

# Copy Gradle wrapper files (if you use gradlew, which is recommended)
COPY gradlew .
COPY gradle ./gradle

# Copy project build files
COPY build.gradle.kts .
# If you have a settings.gradle.kts, uncomment and copy it too:
# COPY settings.gradle.kts .

# Copy the source code
COPY src ./src

# Grant execute permission to gradlew and run the build
# Using --no-daemon is recommended for CI/CD environments
RUN chmod +x ./gradlew && ./gradlew bootJar --no-daemon

# Stage 2: Create the runtime image
FROM eclipse-temurin:17-jre-alpine
# eclipse-temurin:17-jre-alpine is a small JRE image based on Alpine Linux.

WORKDIR /app

# Create a non-root user and group for security
RUN addgroup -S appgroup && adduser -S appuser -G appgroup

# Copy the executable JAR from the builder stage
# The JAR name is typically <project.name>-<project.version>.jar.
# project.name defaults to the directory name ('emise') if not set in settings.gradle.kts.
# So, it would be something like 'emise-0.0.1-SNAPSHOT.jar'.
# Using *.jar is a robust way to copy it if only one JAR is expected.
COPY --from=builder /app/build/libs/*.jar app.jar

# Switch to the non-root user
USER appuser

# Expose the port your Spring Boot application listens on (default is 8080)
# Your application.yaml does not specify a server.port, so 8080 is assumed.
EXPOSE 8080

# Set the entrypoint to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

# You can add JVM options here if needed, e.g.:
# ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-Xmx512m", "-jar", "app.jar"]