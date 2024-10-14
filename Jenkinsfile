pipeline {
    agent any

    tools {
        maven 'Maven' // Ensure Maven is installed and configured in Jenkins tools
    }

    stages {
        stage('Checkout') {
            steps {
                // Check out code from the repository
                git branch: 'master', url: 'https://github.com/tanmay2233/SELab.git'
            }
        }

        stage('Build') {
            steps {
                // Run Maven build and package the project
                script {
                    sh 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                // Run Maven tests
                script {
                    sh 'mvn test'
                }
            }
        }
    }

    post {
        success {
            echo 'Build and tests succeeded!'
        }
        failure {
            echo 'Build or tests failed!'
        }
    }
}
