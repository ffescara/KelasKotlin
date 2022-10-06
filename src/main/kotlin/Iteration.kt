fun main() {
    var i = 0

    while (i<=10) {
        println(i)
        i++
    }

    val cars = arrayOf("Volve", "BMW", "Ford", "Mazda")

    for (car in cars) {
        val pesan = "Ini adalah mobil $car"
        println(pesan)
    }

    for (x in 'a'..'e') {
        println(x)
    }

    for (char in "Polban") {
        println(char)
    }
}