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
                sh 'mv /var/jenkins_home/workspace/BuildMove/ /mnt/Teste/BuildMove'
            }
        }
        
    }
     post {
        success {
            echo 'Movimento bem-sucedido! Pipeline concluída com sucesso.'
        }
    }
}
