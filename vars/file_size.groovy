def call(steps, file_name) {
    def size = steps.sh(script: "stat -c%s ${file_name}", returnStdout: true).trim()
    return size.toLong()
}