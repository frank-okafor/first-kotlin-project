package arrays

class ArrayTest {

    val names = arrayOf("frank", "peace");
    val ages = ArrayList<Int>();
    val objectArray = arrayOf("man", 3, 'D', 4L);

    val array = arrayOf("")//un-resizable array
    val list = listOf("")//immutable list
    val arrayList = arrayListOf("")//mutable and resizable array-List

    fun addAges() {
        ages.add(2);
        var size = ages.size;
        var number = names.size;
        val name = names[1];

        for (value in objectArray) {
            println("value is: $value")
        }
        println("\n");
    }

    fun findMaxNumberInArray(numbers: Array<Int>) {
        var maxNumber = numbers[0];
        for (number in numbers) {
            if (number > maxNumber)
                maxNumber = number;
        }
        println("maximum number is: $maxNumber")
    }

    fun arraysChanged(): Boolean {
        return arrayList.add("Frank");
    }

    fun arraySublist() {
        //this will give us the sublist of a given array given specific indexes
        val subList = arrayList.subList(1, 3);
        println("sublist value: $subList")
    }
}

fun main() {
    val test = ArrayTest();
    test.addAges();
    test.findMaxNumberInArray(arrayOf(1, 3, 7, 89, 43, 2));
}