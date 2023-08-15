pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                bat 'dotnet build' // Ou use 'sh' se estiver no Linux
            }
        }
        
        stage('Move Build to E:\\Teste') {
            steps {
                // Mover o resultado do build para a pasta "E:\Teste"
                bat 'move .\\<caminho\\do\\arquivo> E:\\Teste' // Ou use 'mv' se estiver no Linux
            }
        }
    }
}
