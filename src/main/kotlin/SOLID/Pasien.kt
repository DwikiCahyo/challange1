

package SOLID

open class Pasien: GetPasien() {

    override fun getName(pasien: DataPasien) {
        println("Nama pasien : ${pasien.name}")
    }

    override fun getUmur(pasien: DataPasien) {
        println("Umur pasien : ${pasien.umur}")
    }

}

fun main(){
    val nama = "Darman"
    val umur = 66
    val rawat = true
    val pasien = DataPasien(nama,umur)

    //Mengambil data pasien
    val getPasienData = Pasien()
    getPasienData.getName(pasien)
    getPasienData.getUmur(pasien)

    //Misal butuh apakah data beserta statusnya
    val statusRawarPasien = PasienRawat()
    statusRawarPasien.getName(pasien)
    statusRawarPasien.getUmur(pasien)
    statusRawarPasien.isRawat(rawat)



}
