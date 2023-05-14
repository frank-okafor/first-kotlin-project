package oop.interfacetest

interface Driveable {
    fun drive()

    fun isLicensed()
}

interface Buildable {
    val timeRequired: Int
    fun build()
}


class Car(name: String) : Driveable, Buildable {

    override val timeRequired = 100

    override fun build() {
        TODO("Not yet implemented")
    }

    override fun drive() {
        println("can only drive with biometrics")
    }

    override fun isLicensed() {
        println("only licensed for exclusive users")
    }

}