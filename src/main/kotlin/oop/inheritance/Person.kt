package oop.inheritance

open class Person {// the open keyword wll make this class open for inheritance

    fun greet() {
        println("Hello dear, good day to you")
    }
}


class Student : Person() {
// this student class is inheriting from the person class
}

fun main() {
    val test = Student();
    test.greet();
}