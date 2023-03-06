package oop

open class mahasiswa {
    private var name:String = "Dwiki"
   var name2:String = "DwikiFuad"
    protected open var  fuad:String = "Fuad"
    open protected fun example(){
        println("Fuad")
    }
}
class AndroidClass :mahasiswa(){

    override var fuad: String
        get() = super.fuad
        set(value) {

        }

    override fun example() {
        super.example()
    }
}

fun main(){
    val mhs = mahasiswa()

}
