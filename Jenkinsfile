pipeline {
    agent any
    stages {
        stage ('Build') {
            steps {
                bat 'dir groupproject'
                bat 'npm run start'
            }
        }
    }
}
