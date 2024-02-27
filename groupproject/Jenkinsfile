pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'cd groupproject'
                bat 'npm install'
            }
        }
        stage('Deploy') {
            steps {
               bat 'json-server --watch db.json --port 8000'
               bat  'npm run dev'
            }
        }
    }
}