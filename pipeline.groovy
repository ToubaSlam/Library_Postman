pipeline {
    agent any

    stages {
        stage('Run Test') {
            steps {
                bat 'newman run "Library.postman_collection.json" -e Test.postman_environment.json --reporters=cli,htmlextra'
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'newman/*.html', allowEmptyArchive: true
        }
    }
}