def call(steps, List file_names) {
    for (fn in file_names) {
        def content = "This is ${fn} file."
        steps.sh(script: "echo ${content} > ${fn}")
        steps.sh(script: "cat ${fn}")
    }
}