fun icAciToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

fun main() {
    println("Kenar sayısını girin:")
    val kenarSayisi = readLine()!!.toInt()

    val toplamIcAci = icAciToplami(kenarSayisi)
    println("İç açılar toplamı: $toplamIcAci derece")
}
