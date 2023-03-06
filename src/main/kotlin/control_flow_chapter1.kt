fun main(){
  var i = 0
    while (i < 10){
        i++
        if (i == 4){
            break
        }
    }
    println("print ${i}")

    while (i<7){
        if(i==4){
            i++
            continue
        }
        println(i)
        i++
    }


    when(4){
        1 -> println("Setunggal")
        2-> println("Kalih")
        4-> println("Sekawan")
        else -> println("Ga ngerti")
    }

    val nilai1 = 25
    val nilai2 = 20
    val nilai3 = 30

    val hasil = if(nilai1 > nilai2){
        val max = if (nilai1 > nilai3) {
            nilai1
        }
        else {
            nilai3
        }
        "body of if $max"
    }
    else if (nilai2 > nilai3){
        "body of else if $nilai2"
    } else {
        "body of else if $nilai3"
    }
    println(hasil)

    println("Masukan NIlaai")
    val score: Int = readLine()?.toInt() ?: 0

    if (score > 0) {
        if (score > 100) {
            println("Tidak boleh dari 100")
        } else if (score > 50) {
            print("lulus")
        } else  {
            print("Tidaak lulus")
        }
    } else {
        print("tidak bolleh negaatif ataau 0")
    }

   latihanKondisi()
}

fun latihanKondisi() {
    
}




