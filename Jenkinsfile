pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'npm install'
                bat ' npm run build'
            }
        }
        stage('Deploy') {
            steps {
               bat 'json-server --watch db.json --port 8000'
               bat  'npm run start'
        }
    }
}
