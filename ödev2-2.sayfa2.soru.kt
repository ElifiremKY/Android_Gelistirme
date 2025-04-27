fun maasHesapla(gunSayisi: Int): Int {
    val calismaSaati = gunSayisi * 8
    return if (calismaSaati <= 160) {
        calismaSaati * 10
    } else {
        val normalSaat = 160
        val mesaiSaat = calismaSaati - 160
        (normalSaat * 10) + (mesaiSaat * 20)
    }
}

fun main() {
    println("Çalışılan gün sayısını girin:")
    val gunSayisi = readLine()!!.toInt()

    val maas = maasHesapla(gunSayisi)
    println("Toplam maaş: $maas ₺")
}
