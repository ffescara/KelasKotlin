fun main() {

    var lamaParkir: Int
    var biayaParkir: Float
    var hari: Int
    var jam: Int

    // rule biaya parkir

    val tarifDasar = 1.0
    val tarifBerikutnya = 0.5
    val maxTarifPerHari = 15

    lamaParkir = 72
    hari = lamaParkir/24
    jam = lamaParkir%24

    if (lamaParkir<=5) {
        biayaParkir = (lamaParkir * tarifDasar).toFloat()
    } else if (lamaParkir>5 && lamaParkir<24) {
        biayaParkir = (5 + tarifBerikutnya * (jam-5)).toFloat()
    }else {
        biayaParkir = ((maxTarifPerHari * hari) + (tarifBerikutnya * jam)).toFloat()
    }

    println("Lama Parkir: $lamaParkir")
    println("Biaya Parkir: $biayaParkir")
}