pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out code...'
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                echo 'Compiling Java code...'
                sh 'javac HelloWorld.java'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Running application test...'
                sh 'java HelloWorld < /dev/null || true'
            }
        }
    }
    
    post {
        success {
            echo 'Build successful!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
