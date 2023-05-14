package oop.abstractions

class Employer : Human() {
    // inheriting an abstract class
    override fun speak() {
        println("Hello dear, welcome to Hexad")
    }

    override fun move() {
        println("We move in private jets")
    }
}