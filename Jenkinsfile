pipeline {
    agent {
        docker { image 'maven:3.9.9-eclipse-temurin-21-alpine' }
    }
    stages {
        stage('Build') {
            steps {
                echo "Building.."
                sh '''
                echo "gradle build here ..."
                '''
            }
        }
        stage('Test') {
            steps {
                echo "Testing.."
                sh '''
                echo "start testing here ..."
                '''
            }
        }
        stage('Deliver') {
            steps {
                echo 'Deliver....'
                sh '''
                echo "doing delivery stuff.."
                '''
            }
        }
    }
}