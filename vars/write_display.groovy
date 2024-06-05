def call(steps, List file_names) {
    for (fn in file_names) {
        def filename = "${fn}.txt"
        def content = "This is ${filename} file."
        steps.sh(script: "echo ${content} > ${filename}")
        steps.sh(script: "cat ${filename}")
    }
}