pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Move Build to /mnt/Teste') {
            steps {
                sh 'mv /var/jenkins_home/workspace/BuildMove/ /mnt/Teste'
            }
        }
        post {
        always {
            echo 'Pipeline completed'
        }
        success {
            echo 'Pipeline successful!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
    }
}
