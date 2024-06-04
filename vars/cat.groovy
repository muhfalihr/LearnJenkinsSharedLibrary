def call(String file_name) {
    sh("cat ${file_name}")
}