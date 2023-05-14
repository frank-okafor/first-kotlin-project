package operators

class OperatorTest {

    var x = 5;
    var y = 4;
    var result = x + y;


    fun print() {
        result += 5;
        println("normal addition result: x + y: $result")
        println("place-holder expression addition result: x + y: ${x + y}")
        // expression that evaluates to a single value is only allowed here.
        println("place-holder expression subtraction result: x - y: ${x - y}")
        println("place-holder expression multiplication result: x * y: ${x * y}")
        println("place-holder expression division result: x / y: ${x / y}")
        println("place-holder expression remainder result: x % y: ${x % y}")

        x++;
        ++y;
        println("print before increment: $x")
        println("increment before print: $y")
    }
}


fun main() {
    val test = OperatorTest();
    test.print();
}