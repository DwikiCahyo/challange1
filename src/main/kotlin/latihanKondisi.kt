

fun main(){
    //IF1
    println("Masukan angka : ")
    val input: Int = readLine()?.toInt() ?: 0
    val result = isOdd(input)
    println(result)
    //IF2
    println("Masukan Harga : ")
    val price: Double = readLine()!!.toDouble()
    println("Masukan Diskon")
    val disc:Double = readLine()!!.toDouble()
   val priceAfter = getDisc(price,disc)
    if (priceAfter != price) println("Harga Setelah diskon $priceAfter") else println("Tidak ada diskon, Harga : $price")

    //when1
    val day = readLine()!!.toInt()
    println(convertDay(day))
    //When2
    val Number = readLine()!!.toInt()
    println(positiveNumber(Number))

    //Range1
    checkGenap()
    //Range2
    urutanAngka()
    //Range3
//    for (i in 1..100){
//
//    }

    //Looping For 1
    piramida1()








}

fun piramida1() {
    val baris = 5
    for (i in 1..baris) {
        for (j in 1..i) {
            print("*" )
        }
        println()
    }
}

fun urutanAngka() {
    for (i in 1..10){
        print("$i, ")
    }
}

fun checkGenap() {
    for (i in 1..10 step(2)){
        print("$i, ")
    }
}


fun positiveNumber(number: Int):String {
    return when{
        number>0 -> "Positive"
        number<0 -> "Negative"
        else -> "Nol"
    }
}

fun convertDay(number: Int):String {
    return when(number){
        1 -> "Senin"
        2 -> "Selasa"
        3 -> "Rabu"
        4-> "Kamis"
        5 -> "Jumat"
        6 -> "Sabtu"
        7 -> "Minggu"
        else -> "Hari tidak terdektsi"
    }
}


fun getDisc(price:Double,disc:Double):Double {
    if (price > 100 && disc >= 10) {
        return (100 - disc) * price
    } else {
        return price
    }
}

fun isOdd(number:Int):Boolean {
    if(number > 0 && number != 0) {
        if (number % 2 == 0) return false else return true
    } else {
         error("Angka Tidak boleh nol atau negatif")
    }
}



