pipeline {
    agent {
        docker {
            image 'gradle:latest' // Or a specific Gradle version
            args '-v /var/run/docker.sock:/var/run/docker.sock -v jenkins_home:/home/jenkins/agent -v gradle_cache:/home/gradle/.gradle'
        }
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