void dbTest() {
    println "Starting DBTest..."
    Class.forName("Non-existed Class")
    println "Finishing dbTest"
}

void something() {
    try {
        dbTest()
    } catch (ClassNotFoundException e) {
        println "Class was not found"
        throw new MyCustomException();
    }

}

something()
println("this is the end")
//try {
//    dbTest()
//} catch (Exception e) {
//    println "Error"
//}


