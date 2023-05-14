package functions

import java.time.LocalDateTime

class FuctionTest {
    // Functions and arguments..

    fun whatIsYourName(name: String) {//this is how to write arguments in kotlin.
        println("welcome to my program: $name")
    }

    //function with a return type
    fun getMaxNumber(x: Int, y: Int): Int {
        var result: Int;
        if (x > y) {
            result = x;
        } else if (y > x) {
            result = y;
        } else {
            result = 0;
        }
        return result;
    }

    //a function can also be represented like this if it only has a single line of expression and the return can be inferred
    fun singleLineExpressionGetMax(x: Int, y: Int) = if (x > y) x else y;

    //function overloading
    fun singleLineExpressionGetMax(x: Double, y: Double) = if (x > y) x else y;

    fun sendMessageFunctionWithAlreadyDeterminedArguments(
        name: String = "Frank",
        message: String = "you are a genius"
    ) {
        println("$name $message")
    }

    //method with multiple arguments of a specific type
    fun sumAllIntegers(vararg numbers: Int): Int {
        //this method will enable you put an infinite amount of arguments of int and they can be looped through
        var result = 0;
        for (number in numbers) {//how to represent advance for loop in kotlin.
            result += number;
        }
        return result;
    }

    fun printVarArgParametersUsingForEach(vararg numbers: Int) {
        numbers.forEach { println(it) };
    }

    fun getCurrentDate(): LocalDateTime {
        return LocalDateTime.now();
    }
}


fun main() {
    val test = FuctionTest();
    val name = "Frank";
    test.whatIsYourName(name);
    val max = test.getMaxNumber(7, 4);
    println("maximum number is: $max\n");
    println("maximum number in braces is: ${test.getMaxNumber(7, 4)}\n");
    println("single line expression maximum number in braces is: ${test.singleLineExpressionGetMax(56, 100)}\n");
    println(
        "overloaded single line expression maximum number in braces is: " +
                "${test.singleLineExpressionGetMax(5.6, 2.6)}\n"
    );
    println("function with default argument ${test.sendMessageFunctionWithAlreadyDeterminedArguments()}\n")
    println("vararg method with many parameters: ${test.sumAllIntegers(2, 4, 6, 7, 9)}\n");
    println(
        "print vararg method with many parameters in foreach: ${
            test.printVarArgParametersUsingForEach(
                2,
                4
            )
        }\n"
    );
}