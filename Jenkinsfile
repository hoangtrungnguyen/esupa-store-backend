pipeline {
    agent {
        docker {
            image 'openjdk:17-jdk-slim' // Specify the Docker image to use
        }
    }

    tools {
        gradle 'Gradle 8.13'
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
                sh 'gradle clean build'
            }
        }
        stage('Test') {
            steps {
                sh 'gradle test'
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