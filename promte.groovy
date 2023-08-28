    container('docker') {
        imageExists = true
        docker.withRegistry(protocol + config.targetArtifactory, config.targetCredentialName) {
            try {
                shWrapper.run("docker manifest inspect --insecure ${config.targetArtifactory}/${config.targetImageName}:${config.targetImageTag}")
                println("${config.targetArtifactory}/${config.targetImageName}:${config.targetImageTag} available")
            } catch (Error) {
                imageExists = false
                println("${config.targetArtifactory}/${config.targetImageName}:${config.targetImageTag} not available")
            }
        }
