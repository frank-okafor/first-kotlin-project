package variables

class NumberVariables {
    val maxIntegerValue = Int.MAX_VALUE;
    val minIntegerValue = Int.MIN_VALUE;

    val maxByteValue = Byte.MAX_VALUE;
    val minByteValue = Byte.MIN_VALUE;

    val maxShortValue = Short.MAX_VALUE;
    val minShortValue = Short.MIN_VALUE;

    val maxLongValue = Long.MAX_VALUE;
    val minLongValue = Long.MIN_VALUE;

    val maxFloatValue = Float.MAX_VALUE;
    val minFloatValue = Float.MIN_VALUE;

    val maxDoubleValue = Double.MAX_VALUE;
    val minDoubleValue = Double.MIN_VALUE;

    fun print() {
        println("short max value: $maxShortValue\nshort min value: $minShortValue\n");
        println("byte max value: $maxByteValue\nbyte min value: $minByteValue\n");
        println("integer max value: $maxIntegerValue\ninteger min value: $minIntegerValue\n")
        println("long max value: $maxLongValue\nlong min value: $minLongValue\n");
        println("float max value: $maxFloatValue\nfloat min value: $minFloatValue\n");
        println("double max value: $maxDoubleValue\ndouble min value: $minDoubleValue\n");
    }
}

fun main() {
    val test = NumberVariables();
    test.print();
}