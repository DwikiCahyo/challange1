package SOLID

class PasienRawat:Pasien() {

    fun isRawat(isTrue:Boolean){
        println("Pasien rawat : ${if (isTrue) "Dirawat" else "Tidak dirawat"}")
    }
}