def call(String json_text) {
    def jsonSlurper = new JsonSlurper()
    def jsonObject = jsonSlurper.parseText(json_text)
    return jsonObject
}