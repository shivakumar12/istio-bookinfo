pipeline {
    agent any

    environment {
        IMAGE_NAME = 'your-image-name'
        IMAGE_TAG = 'your-image-tag'
    }

    stages {
        stage('Check Image Existence') {
            steps {
                script {
                    def dockerInspectResult = sh(script: "docker inspect ${IMAGE_NAME}:${IMAGE_TAG}", returnStatus: true)
                    
                    if (dockerInspectResult == 0) {
                        echo "Image exists: ${IMAGE_NAME}:${IMAGE_TAG}"
                    } else {
                        echo "Image does not exist: ${IMAGE_NAME}:${IMAGE_TAG}"
                    }
                }
            }
        }
    }
}
