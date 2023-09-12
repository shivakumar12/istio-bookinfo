@Library 'your-shared-library' // Import the shared library containing utils.groovy

pipeline {
    agent any

    stages {
        stage('Example Stage') {
            steps {
                script {
                    // Import the constants and functions from the 'utils.groovy' script
                    def utils = load 'utils.groovy'

                    // Access the constant variable
                    echo "Value of MY_CONSTANT: ${utils.MY_CONSTANT}"

                    // Define template and variables for HTML template replacement
                    def template = '<p>Hello, ${NAME}!</p>'
                    def variables = [NAME: 'John']

                    // Call the replaceTemplateVariables function
                    def replacedTemplate = utils.replaceTemplateVariables(template, variables)

                    // Print the replaced HTML template
                    echo "Replaced HTML template: ${replacedTemplate}"
                }
            }
        }

        // Add more stages as needed
    }
}
