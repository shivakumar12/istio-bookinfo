pipeline {
    agent any

    environment {
        ARTIFACTORY_URL = 'https://your-artifactory-url'
        REPO_NAME = 'your-repo-name'
        CREDENTIALS_ID = 'your-credentials-id'
    }

    stages {
        stage('Example') {
            steps {
                script {
                    def credentials = credentials("${CREDENTIALS_ID}")
                    def username = credentials.username
                    def apiKey = credentials.password
                    
                    def response = sh(script: "curl -u ${username}:${apiKey} -X GET ${ARTIFACTORY_URL}/api/storage/${REPO_NAME}", returnStdout: true).trim()
                    echo "Response: ${response}"
                }
            }
        }
    }
}
