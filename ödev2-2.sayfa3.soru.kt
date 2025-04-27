fun kotaUcretiHesapla(kota: Int): Int {
    return if (kota <= 50) {
        100
    } else {
        val ekstraGb = kota - 50
        100 + (ekstraGb * 4)
    }
}

fun main() {
    println("Kullanılan kota miktarını (GB) girin:")
    val kota = readLine()!!.toInt()

    val ucret = kotaUcretiHesapla(kota)
    println("Toplam ücret: $ucret ₺")
}
