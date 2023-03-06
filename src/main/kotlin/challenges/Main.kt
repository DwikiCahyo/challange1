package challenges

class LeftPiramidaBintang:Shape(){

    override fun createShape(star: Star) {

        val total = star.totalStar

        for (i in 1.rangeTo(total)){
            for (j in  1.rangeTo(i) ){
                print("* ")
            }
            println()
        }
    }
}


class PiramidaBintang:Shape(){

    override fun createShape(star: Star) {

        val total = star.totalStar

        for (i in 1.rangeTo(total)){
            for (j in 1.rangeTo(total-i)){
                print("  ")
            }
            for (j in 1 until 2*i){
                print("* ")
            }
            println()
        }
    }
}


class PiramidaBintangTerbalik :Shape(){

    override fun createShape(star: Star) {

        val total = star.totalStar

        for (i in total.downTo(1)){

            for (j in i until total){
                print("  ")
            }

            for (k in 1 until 2*i){
                print("* ")
            }
            println()
        }
    }

}


class Silang:Shape(){

    override fun createShape(star: Star) {
        val total = star.totalStar

            for(i in 1.rangeTo(total)){
                for(j in 1.rangeTo(total)){
                    if( i==j || (j == total - i + 1)) print("*") else print(" ")
                }
                println("")
            }
    }

}

class Tambah:Shape(){
    override fun createShape(star: Star) {
        val total = star.totalStar

        for(i in 1 until total *2){

            if (i != total){
                for (j in 1.rangeTo(total)){
                    if (j == total){
                        print("*")
                    }
                    print(" ")
                }
            } else{
                for (k in 1 until total*2){
                    print("*")
                }
            }
            println()
        }
    }
}

class Diamond:Shape(){

    override fun createShape(star: Star) {
       val total = star.totalStar

        val column = total *2 -1

        for (i in 0.rangeTo(total)){
            for (j in 0.rangeTo(column+1)){
                if (j >= total-i && j <= total+i){
                    print("*")
                }
                else{
                    print(" ")
                }
            }
            println()
        }
        for (i in total-1 downTo 0){
            for (j in column +1 downTo 0){
                if (j >= total-i && j <= total+i){
                    print("*")
                }
                else{
                    print(" ")
                }
            }
            println()
        }

    }

}




fun main(){
    print("Masukan jumlah Bintang: ")
    val inputStar = readLine()?.toInt()
    val star = inputStar?.let { Star(it) }

    val leftPiramidaBintang = LeftPiramidaBintang()
    leftPiramidaBintang.createShape(star!!)
    println()


    val piramidaBintang = PiramidaBintang()
    piramidaBintang.createShape(star)
    println()


    val piramidaBintangTerbalik = PiramidaBintangTerbalik()
    piramidaBintangTerbalik.createShape(star)
    println()

    val silang = Silang()
    silang.createShape(star)
    println()

    val tambah = Tambah()
    tambah.createShape(star)
    println()

    val diamond = Diamond()
    diamond.createShape(star)
    println()


}
