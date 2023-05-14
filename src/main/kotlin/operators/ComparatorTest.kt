package operators

class ComparatorTest {

    var isActive = true;

    fun print() {
        var status = "";
        if (isActive) {
            status = "active";
        } else {
            status = "inactive";
        }
        println("User frank is $status")
    }
}

fun main() {
    val test = ComparatorTest();
    test.print();
}