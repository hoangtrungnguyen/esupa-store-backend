pipeline {
  agent {
    docker {
      image 'esupa-store-backend'
    }

  }
  stages {
    stage('dev') {
      steps {
        sh 'echo "Hello World"'
      }
    }

  }
  environment {
    dev = 'dev'
  }
}