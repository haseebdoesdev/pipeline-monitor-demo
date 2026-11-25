pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Retrieving source code...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Compiling Java application...'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running unit tests...'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging application...'
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }

        failure {
            echo 'Pipeline execution failed!'
        }
    }
}
