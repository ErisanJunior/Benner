pipeline {
    agent any
    
    stages {
        stage('Checkout do Git e Build') {
            steps {
                checkout scm
            }
        }
        stage('Deploy Arquivos') {
            steps {
                sh 'mv /var/jenkins_home/workspace/PrimeiroJob/ /mnt/Teste/BuildMove'
            }
        }
        
    }
     post {
        success {
            echo 'Movimento bem-sucedido! Pipeline concluída com sucesso.'
        }
    }
}
