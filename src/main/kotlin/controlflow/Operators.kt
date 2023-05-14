package controlflow

class Operators {

    val main = null;

    //to declare a nullable variable
    val name: String? = "Frank";

    fun print() {
        val text: String? = null;
        println("print null if string is null but we try to call a method from it: ${text?.length}")
        println("throw a null pointer exception if string is null but we try to call a method from it ${text!!.length}")
    }

    fun printTernary() {
        var text: String? = null;
        // this is a way to write ternary operators in kotlin
        val result = text ?: "I am not null";//if text is null return string else return text.
        print(result)
    }
}

fun main() {
    val test = Operators();
    test.printTernary();
}
