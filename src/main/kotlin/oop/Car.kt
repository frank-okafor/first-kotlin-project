package oop


//classes can be assigned parameters like methods
// The properties can also be directly inserted into the class
class Car(var name: String, var model: String, var color: String, var tires: Int, seaters: String, country: String) {
// this useful when you don't want to perform any validations on the property values

    var seaters = seaters.uppercase();//assign this property using a parameter that is to be modified
    var country: String
    var usage = 14;

    //using the initialization block.
    init {
        //this is how to validate a field using the init block..
        if (country.uppercase().startsWith("J")) {
            this.country = country
        } else {
            this.country = "Japan";
            println("Counry was set default to Japan\n")
        }
    }

    fun move() {
        println("${name} car is moving\n")
    }

    fun description() {
        println(
            "This is a $color $model $name with a total of $tires tires and $seaters seaters made in $country, " +
                    "very durable and affordable"
        )
    }

    fun getCarUsage() = usage - 4;//functions can be expressed in this form too

}


fun main() {
    val car = Car("Honda", "2018", "Black", 4, "seven", "Mali");

    car.move();
    car.description();
}