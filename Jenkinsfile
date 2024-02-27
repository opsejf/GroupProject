pipeline {
    agent any
    stages {
        stage ('Build') {
            steps {
                bat 'npm install'
                bat 'npm i -S react-scripts'
                bat 'npm i react-router-dom --save'
                
            }
        }
        stage ('Deploy') {
            steps {
                bat 'npm --prefix groupproject/ start'
            }
        }
    }
}
