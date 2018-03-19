import groovy.transform.TupleConstructor

@TupleConstructor
class Customer{
    String mailingName
    String address
    final Date dateOfBirth

//    Customer(String mailingName, Date dateOfBirth) {
//        this.mailingName = mailingName
//        this.dateOfBirth = dateOfBirth
//    }

    void setAddress(String address) {
        this.address = address
        println("setAddress has been run")
    }

    String getAddress() {
        throw new IllegalAccessException()
    }
}
