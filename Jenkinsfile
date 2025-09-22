pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // This step checks out your code from the GitHub repository
                git branch: 'main', url: 'https://github.com/BalasubramanianV32/VAC-Devops.git'
                echo 'Code checked out successfully.'
            }
        }
        
        stage('Build Docker Image') {
            steps {
                // Builds the container using your Dockerfile
                // and names it 'vac-devops-website'
                sh 'docker build -t vac-devops-website .'
            }
        }

        stage('Deploy Container') {
            steps {
                // Stops and removes any old version of the container
                sh 'docker stop vac-devops-website || true'
                sh 'docker rm vac-devops-website || true'
                
                // Runs the new container
                // Connects server port 8080 to the container's port 80
                sh 'docker run -d --name vac-devops-website -p 8080:80 vac-devops-website'
            }
        }
    }
}