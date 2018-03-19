
def myName = "Bidi charge \$ ${2+2} per hour"


def greeting = "Hello $myName"
String greeting2 = "Hello $myName"
println greeting
println greeting2
println greeting.getClass()
println greeting2.getClass()
println greeting.equals(greeting2)


def myStringBuilder  = new StringBuilder();
myStringBuilder << "Start "
myStringBuilder << "end"
println myStringBuilder.toString()


def emptyGreeting = greeting -= "Bidi"
println(emptyGreeting)