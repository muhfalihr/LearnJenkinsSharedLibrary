def call(steps, List<Map> personalData) {
    personalData.each { pd ->
        def raw_fn = "${pd.fullname}"
        def trimmedstr = raw_fn.trim()
        def filename = trimmedstr.toLowerCase()
        def content = """
FullName  : ${pd.fullname}
Age       : ${pd.age}
BirthDate : ${pd.birthdate}
"""
        steps.sh("echo ${content} > ${filename}.txt")
        steps.sh(script: "cat ${filename}.txt")
    }
}