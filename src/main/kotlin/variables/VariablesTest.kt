package variables

class VariablesTest {
    var myName = "Frank Okafor"; // store any variable

    // Kotlin has something called type inference and doesn't need you to always assign types to your variables
    var address: String = "Pstrasse 1 Wolfsburg"; // store specific variable type

    val name = "";
    //this val keyword means the varible is static final and cannot be reassigned.

    var myAge = 30;

    fun print() {
        println("my name is $myName i live in $address!")
        //dollar sign within a string automatically concatenates it
    }

}

fun main() {
    val test = VariablesTest();
    test.print();
}