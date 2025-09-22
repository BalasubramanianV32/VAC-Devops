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
        
        stage('Build') {
            steps {
                // For a static HTML/CSS/JS site, there's no real "build" step.
                // We'll just archive the files as build artifacts.
                echo 'No build needed for a static site. Archiving files...'
                archiveArtifacts artifacts: '**/*', followSymlinks: false
            }
        }

        stage('Deploy') {
            steps {
                // This is a placeholder for your deployment step.
                // You could add steps here to copy files to a web server.
                echo 'Deployment stage is ready. Configure deployment steps here.'
            }
        }
    }
}