fun faktoriyel(sayi: Int): Long {
    var sonuc: Long = 1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}

fun main() {
    println("Bir sayı girin (tam sayı olarak):")
    val sayi = readLine()!!.toInt()

    val fakt = faktoriyel(sayi)
    println("$sayi sayısının faktöriyel: $fakt")
}
