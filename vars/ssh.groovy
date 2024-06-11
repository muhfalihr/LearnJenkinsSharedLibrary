def call(steps, String sshCommand) {
    def result = steps.sh(script: sshCommand, returnStatus: true)
    steps.sh("echo SSH command returned status: ${result}")
}