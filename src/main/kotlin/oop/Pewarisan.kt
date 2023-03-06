package oop

open class Hewan() {

    open fun deskripsi(){
        println("deskripsi hewan")
    }

    open fun nameAnimal(nama:String){
        println("nama binatang : $nama")
    }

}
open class harimau():Hewan(){
    override fun deskripsi() {
        super.deskripsi()
    }

    override fun nameAnimal(nama: String) {
        super.nameAnimal(nama)
    }

}

class harimauSumatera:harimau(){

    override fun deskripsi() {
        println("Fuaad Ganteng")
    }
}