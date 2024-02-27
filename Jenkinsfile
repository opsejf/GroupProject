pipeline {
    agent any
    stages {
        stage ('Build') {
            steps {
                bat 'npm install'
                bat 'npm i -S react-scripts'
                
            }
        }
        stage ('Deploy') {
            steps {
                bat 'npm --prefix groupproject/ start'
            }
        }
    }
}
