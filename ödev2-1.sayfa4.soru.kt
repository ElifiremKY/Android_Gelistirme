fun sayAharfi(kelime: String): Int {
    var sayac = 0
    for (char in kelime) {
        if (char == 'a' || char == 'A') {
            sayac++
        }
    }
    return sayac
}

fun main() {
    println("Bir kelime girin:")
    val kelime = readLine()!!.toString()

    val aSayisi = sayAharfi(kelime)
    println("Kelimenin içinde $aSayisi adet 'a' harfi var.")
}
