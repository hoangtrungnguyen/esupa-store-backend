pipeline {
    agent {
        docker {
            image 'openjdk:17-jdk-slim' // Specify the Docker image to use
            args '-u root' // Optional: Run the container as root if needed (use with caution)
        }
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Gradle Build') {
            steps {
                sh 'chmod +x gradlew'
                sh './gradlew clean build'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
//        stage('Package') {
//            steps {
//                sh './gradlew bootJar'
//            }
//        }
        stage('Archive Artifacts') {
            steps {
                archiveArtifacts 'build/libs/*.jar'
            }
        }
    }
}