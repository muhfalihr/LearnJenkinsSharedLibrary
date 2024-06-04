def call(steps, String file_name) {
    steps.sh("cat ${file_name}")
}