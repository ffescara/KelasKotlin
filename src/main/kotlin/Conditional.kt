fun main() {

    val isSamboGuilty = true
    val isFalse = false

    if (isSamboGuilty) {
        println("He will be jailed")
    } else {
        println("Something wrong with this country")
    }

    val lamaTahanan = if (isSamboGuilty) 50 else 0

    println(lamaTahanan)

    val num = 8

    val result = when {
        num > 5 && num < 7 -> "Positive"
        num > 7 -> "Negative"
        else -> "out of bound"
    }
    println(result)
}