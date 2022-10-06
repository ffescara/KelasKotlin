package oop

fun main() {

    val hewan = Hewan()
    hewan.makan()
    hewan.buangair()

    val kucing = Kucing()
    println(kucing.isMamal)
    kucing.makan()

    val ayam = Ayam()
    println(ayam.isMamal)
    ayam.makan()
}