// Define constant variables
def MY_CONSTANT = 'Hello, World!'

// Function to replace template variables
def replaceTemplateVariables(template, variables) {
    variables.each { key, value ->
        template = template.replaceAll("\\$\\{${key}\\}", value)
    }
    return template
}

// Other utility functions can be added here
