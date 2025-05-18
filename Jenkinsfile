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
                ./gradlew clean build -x test
                '''
            }
        }
        stage('Test') {
            steps {
                echo "Testing.."
                sh '''
                ./gradlew test
                '''
            }
        }
        stage('Create docker image') {
            steps {
                script {
                    def appName = 'test-store-backend'
                    def dockerImageTag = "${appName}:latest"
                     // Assuming your JAR file is in build/libs/your-project.jar
                    def jarFile = findFiles(glob: 'build/libs/*.jar').first().name
                    
                }
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