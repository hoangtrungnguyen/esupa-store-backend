pipeline {
    agent {
        docker {
            image 'openjdk:17-jdk-slim' // Specify the Docker image to use
        }
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
                sh 'git submodule init'
                sh 'git submodule update'
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
        stage('Archive Artifacts') {
            steps {
                archiveArtifacts 'build/libs/*.jar'
            }
        }
    }
}