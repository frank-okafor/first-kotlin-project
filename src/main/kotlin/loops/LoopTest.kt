package loops

import java.util.*

class LoopTest {

    fun forLoop() {
        println("printing i using the range ..")
        for (i in 1..10) {
            //this will loop from 1 - 10
            println("i is: $i")
        }
        println("\n")

        println("printing i using the until")
        for (i in 1 until 10) {
            //this will loop from 1 - 9 more like i < 10
            println("i value using until: $i")
        }
        println("\n")

        println("loop i backward using downto")
        for (i in 10 downTo 1) {
            //this will loop from 10 - 1.
            println("i value using until: $i")
        }
        println("\n")

        println("loop i from 1 - 10 skipping every 2nd iteration")
        for (i in 1 until 10 step 2) {
            //this will loop from 1 - 10 while skipping every 2nd iteration.
            println("i value using until: $i")
        }
        println("\n");
    }

    fun whileLoop() {
        var age = 0;
        while (age < 31) {
            if (age < 1) {
                println("i was born in 1993 so this is the beginning of my life")
                age = 6;
                continue;
            }
            if (age == 6) {
                println("lost my mum in 1999")
                age = 19
                continue;
            }
            if (age == 20) {
                println("i got my admission in 2014")
            }
            if (age == 29) {
                println("i got married in 2022")
            }
            if (age == 30) {
                break;
            }
            if (age in 4..7) {
                continue;
            }
            age++;
        }
        println("\n");
    }

    fun doWhileLoop() {
        var age = 10
        do {
            println("printing age: $age")
            age--;
        } while (age > 1)
        println("\n");
    }


    fun printOddNumbersAndShowCountOfEvenNumbers(vararg numbers: Int) {
        println("printing odd numbers and count of even numbers in given list: ${Arrays.toString(numbers)}")
        var evenNumberCount = 0;
        for (number in numbers) {
            if (number % 2 != 0) println("Odd number found: $number")
            else evenNumberCount++;
        }
        println("\n");
        println("Total count of even numbers is: $evenNumberCount")
    }

    fun getElementsWithIndexInLoops() {
        val names = arrayListOf("frank", "okafor", "peace", "ebuka", "pearl")
        for ((index, name) in names.withIndex()) {
            //this loop will give us the elements with its index
            println("name at index: $index is --> $name")
        }
    }

    fun namingLoopsInKotlin() {
        println("\n");
        outerLoop@ for (i in 1..10) { //i decided to name this loop outerLoop with the given symbol
            innerLoop@ for (j in 1..10) {//i decided to name this loop innerLoop with the given symbol
                if (i - j == 5) {
                    break@outerLoop //this break statement will only affect the outer loop.
                }
                println("i value: $i ----- j value: $j")
            }
        }
    }

}


fun main() {
    val test = LoopTest();
    test.forLoop();
    test.whileLoop();
    //test.doWhileLoop();
    test.printOddNumbersAndShowCountOfEvenNumbers(2, 56, 7, 32, 90, 544, 1, 8, 5);
    test.namingLoopsInKotlin();
}