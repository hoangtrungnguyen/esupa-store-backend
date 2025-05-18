pipeline {
    agent {
        docker {
            image 'gradle:8.7-jdk17'
        }
    }
    stages {
        stage('Build') {
            steps {
                echo "Building.."
                sh '''
                git submodule init
                git submodule update
                echo "Java version:"
                java -version
                echo "Gradle version:"
                chmod +x gradlew
                ./gradlew --version
                ./gradlew clean build
                '''
            }
        }
        stage('Test') {
            steps {
                echo "Testing.."
                sh '''
                echo "start testing here ..."
                sh './gradlew test'
                ./gradlew test
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