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
            parallel{
                    stage ('deploy jason'){
                        steps {
                        bat 'json-server --watch db.json --port 8000'
                        }
                    }
                    stage ('run program'){
                        steps{
                        bat  'npm run start'
                        }
                    }
            }
    }
 }
