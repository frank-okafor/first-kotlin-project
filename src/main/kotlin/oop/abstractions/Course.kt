package oop.abstractions

import java.math.BigDecimal

abstract class Course(val topic: String, val price: BigDecimal) {

    open fun description() {
        println("welcome to learning the new $topic course")
        //this will ensure that any class inheriting this class can override this method
    }

    open fun learn() {
        println("Learning from a course")
    }
}

interface Learnable {
    fun learn() {
        println("Learning")
    }
}

open class KotlinCourse() : Course("Kotlin", BigDecimal("50")), Learnable {
    final override fun description() {
        println("This is the kotlin world where we give 50% discount")
        //this means the description() method is final from this point cannot be overriden by any class inheriting
        //KotlinCourse()
    }

    final override fun learn() {
        //in the case where we implement two super classes with the same methods, this is how to avoid ambiguity
        super<Course>.learn();//calling the learn method from course parent
        super<Learnable>.learn();//calling the learn method from Learnable parent
    }
}

class SpecialKotlinCourse() : KotlinCourse() {

}

fun main() {
    val test: KotlinCourse = SpecialKotlinCourse();
    test.description();
    test.learn()
}