pipeline {
    agent any
    stages {
        stage ('Build') {
            steps {
                bat 'npm install'
                // bat 'npm i -S react-scripts'
                // bat 'npm i react-router-dom --save'
                
            }
        }
        stage ('Deploy') {
            parallel {
                stage ('reactapp') {
                    steps {
                        bat 'npm start'
                    }
                },
                stage ('server') {
                    steps {
                        bat 'npx json-server src/database/Properties.json'
                    }
                }
            }
        }
    }
}
