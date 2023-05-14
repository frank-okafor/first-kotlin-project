package oop.dataclasses

import java.math.BigDecimal

class Book(val title: String, val price: BigDecimal) {
}

data class DataBook(val title: String, val price: BigDecimal) {
//These data classes already have toString methods implemented
    //these classes also help us compare two classes very well without having to implement the equals method
    //these classes also make copying objects from one instance to another very easy
}

fun main() {
    val book = Book("Money", BigDecimal("10"))
    val bookTwo = Book("Money", BigDecimal("10"))
    val dataBook = DataBook("Money", BigDecimal("10"))
    val dataBookTwo = DataBook("Money", BigDecimal("10"))

    println(book)
    println(dataBook)
    println("\n")
    println("is databook equals: ${dataBook.equals(dataBookTwo)}")
    println("is normal book equals: ${book.equals(bookTwo)}")
    println("\n")

    //used here to copy objects while changing an attribute in the new instance
    val dataBookThree = dataBook.copy(price = BigDecimal("8"));

    //used here for decomposition, breaking the attributes of the objects into String variables
    val (title, price) = dataBook;

    //used in a hashset, where hashing is used to erase objects of the same properties
    val set = hashSetOf(dataBook, dataBookTwo, dataBookThree);
    println("data book set: $set")//our set will remove the object that is the same
}