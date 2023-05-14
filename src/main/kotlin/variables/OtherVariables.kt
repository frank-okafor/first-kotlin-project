package variables

class OtherVariables {

    val myCharValue = 'F';
    val myBooleanValue = true;

    fun print() {
        println("checking character value: $myCharValue\nchecking boolean value: $myBooleanValue\n");
    }
}


// the main function must be called stand alone and not written in a class
fun main() {
    val test = OtherVariables();
    test.print();
}