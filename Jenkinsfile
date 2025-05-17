pipeline {
    agent {
        docker {
            image 'gradle:9.0-jdk17'
            args '-v gradle-cache:/root/.gradle'
        }
    }
    stages {
        stage('Preparation') {
            steps {
                sh 'git submodule init'
                sh 'git submodule update'

                echo 'Ensuring gradlew is executable...'
                sh 'chmod +x gradlew'

                echo 'Displaying Gradle and Java versions...'
                sh './gradlew --version'
                // sh 'java -version' // java -version is less critical as gradlew handles Java via toolchains
            }
        }

        stage('Build & Test') {
            steps {
                echo 'Running Gradle clean, build, and tests...'
                // The 'build' task typically depends on 'test', so tests will run.
                // Using --no-daemon is often recommended for CI environments for stability.
                sh './gradlew clean build --no-daemon'
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