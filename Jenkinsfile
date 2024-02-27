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
        parallel {
            a: stage ('reactapp') {
                steps {
                    bat 'npm start'
                }
            }
            b: stage ('server') {
                steps {
                    bat 'npx json-server src/database/Properties.json'
                }
            }
        }
        
    }
}
