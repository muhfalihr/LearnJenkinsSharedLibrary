def call(steps, List<Map> personalData) {
    personalData.each { pd ->
        def raw_fn = "${pd.fullname}"
        def trimmedstr = raw_fn.trim()
        def filename = trimmedstr.toLowerCase()
        def content = "FullName : ${pd.fullname}\nAge : ${pd.age}\nBirthDate : ${pd.birthdate}"
        steps.sh("echo ${content} > ${filename}.txt")
        steps.sh(script: "cat ${filename}.txt")
    }
}