pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                sh 'cd /home/testeMove'
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                sh 'dotnet build'
            }
        }
        
        stage('Move Build to /mnt/Teste') {
            steps {
                sh 'mv ./<caminho/do/arquivo> /mnt/Teste'
            }
        }
    }
}
