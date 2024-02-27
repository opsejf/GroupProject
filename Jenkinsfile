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
                bat 'npm --prefix groupproject/ run start'
            }
        }
    }
}
