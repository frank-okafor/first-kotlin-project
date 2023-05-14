package controlflow

class ControlFlowTest {

    val alarm = 12;

    fun print() {
        //The when statement is used like a switch statement to compare argument with all flow given cases
        when (alarm) {
            12 -> println("alarm time is $alarm am\n");
            7 -> println("the time is $alarm pm");
            5 -> println("the time is $alarm am");
            3 -> println("the time is $alarm pm");

            // this takes in multiple switches to check against the given argument
            2, 8, 9 -> println("multiple switches test");

            // checks if the argument is within the given range
            in 12..20 -> println("range between 12 and 20")

            //checks if the argument is not within the given range
            !in 20..25 -> println("range not in 20 and 25")

            // this is used as default in case none of the results matches the argument.
            else -> println("alarm time is not recorded in this flow");
        }

    }

    fun moreTests() {
        val job = "engineer";
        val alarm = 11;
        // assigning switches to a variable
        val result = when (job) {
            "engineer" -> {
                "He is actually a java engineer learning kotlin\n";
            }

            "male" -> {
                "This has nothing to do with a job bro";
            }

            else -> {
                "Job is not recognized";
            }
        }
        println(result);

        //when statement can also be used as a conditional statement without an argument
        val text = when {
            alarm == 2 || alarm < 10 -> {
                "alarm is in first ten"
            };
            alarm > 20 -> {
                "Alarm is greater than 20"
            };
            else -> {
                "alarm value not captured"
            };
        }
        println(text);
    }
}


fun main() {
    val test = ControlFlowTest();
    test.print();
    test.moreTests();
}