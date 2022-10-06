package oop

class Mobil(kapasitasTanki: Int) {


    var merk: String = "Honda"
        get() = field

        set(value) {

            if (value == "Toyota") {
                field = "Toyota Fortuner"
            } else {
                field = "Honda"
            }

            //field = "Ubah merk $value"
        }

    val tenaga = kapasitasTanki

    fun gas() {
        println("Gasss")
    }

}