fun dereced(c: Double): Double {
    return c * 1.8 + 32
}

fun main() {
    println("bir sıcaklık değeri girin:")
    val derece = readLine()!!.toDouble()
    val fahrenheit = dereced(derece)
    println("$derece derece = $fahrenheit Fahrenheit")
}
