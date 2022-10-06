fun main() {
    var cars = arrayOf("Honda", "Toyota", "BMW")

    cars.forEach { car ->
        println("Ini adalah mobil $car")
    }

    val honda = cars.filter { car -> car == "Honda" }
    println(honda)

    var nilaiMahasiswa = arrayOf(30, 70, 85, 64, 66)

    val lulusMatkulProgramming = nilaiMahasiswa.filter {
        nilai -> nilai >= 65
    }

    println(lulusMatkulProgramming)
}