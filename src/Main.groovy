def getLastLetters(String someValue, length = 1) {
    def result = someValue.substring(someValue.length() - length)
    println("finished")
    result
}

println getLastLetters("Bidi").toUpperCase()
println(getLastLetters("Bidi", 2))