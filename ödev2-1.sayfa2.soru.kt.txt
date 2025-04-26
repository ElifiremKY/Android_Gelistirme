fun hesaplaCevre(uzunKenar: Int, kisaKenar: Int): Int {
    return 2 * (uzunKenar + kisaKenar)
}

fun main() {
    println("Uzun kenarı girin (tam sayı olarak):")
    val uzunKenar = readLine()!!.toInt() 
    println("Kısa kenarı girin (tam sayı olarak):")
    val kisaKenar = readLine()!!.toInt()

    val cevre = hesaplaCevre(uzunKenar, kisaKenar)
    println("Dikdörtgenin çevresi: $cevre")
}
