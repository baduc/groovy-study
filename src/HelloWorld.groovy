import groovy.transform.TypeChecked

@TypeChecked
Integer getSomeValue() {
    def variable1 =  10
    def variable2 =  2
    return variable1 + variable2
}

Integer myString = getSomeValue();
println(myString)