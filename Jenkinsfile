pipeline {
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