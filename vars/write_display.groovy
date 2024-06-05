def call(steps, List<String> fileNames) {
    fileNames.each { fn ->
        def filename = "${fn}.txt"
        def content = "This is ${filename} file."
        steps.sh(script: "echo '${content}' > ${filename}")
        steps.sh(script: "cat ${filename}")
    }
}
