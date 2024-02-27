pipeline {
    agent any
    stages {
        stage ('Build') {
            steps {
                bat 'npm install'
                
            }
        }
        stage ('Deploy') {
            steps {
                bat 'dir groupproject'
                bat 'npm run start'
            }
        }
    }
}
