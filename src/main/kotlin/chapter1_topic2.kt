fun main(args:Array<String>){



    val nama:String = "John Doe"

    val umur:Int = 25

    val gaji:Double = 5000.0

    val status:Boolean = true

    val nilai:Float = 7.5f

    val angka1:Long = 123456789L

    val angka2:Short = 100

    var huruf:Char = 'A'

    val nilaiString:String = "10"

    val angka3:Byte = 25

    val angka = intArrayOf(1,2,3,4,5)

    var hurufArray = charArrayOf('a','b','c','d','e')

    var nilaiArray = doubleArrayOf(3.5,4.0,2.5,3.0)

    val namaArray:Array<String> = arrayOf("John","Doe","Jane","Doe")

    val nammmm:Array<Int?> = arrayOfNulls(5)

    //contoh
    val namaStudent = Array(size = 3){""}
    namaStudent[0] = "Fuad 1"
    namaStudent[1] = "Fuad 2"
    namaStudent[2] = "Fuad 3"
    println(nammmm.contentToString())

    val bulanArray = Array<String>(12){""}
    bulanArray[0] = "Januari"
    bulanArray[1] = "Februari"
    bulanArray[2] = "Maret"
    bulanArray[3] = "April"
    bulanArray[4] = "Mei"
    bulanArray[5] = "Juni"
    bulanArray[6] = "Juli"
    bulanArray[7] = "Agustus"
    bulanArray[8] = "September"
    bulanArray[9] = "Oktober"
    bulanArray[10] = "November"
    bulanArray[11] = "Desember"
    println(bulanArray.contentToString())


    val nilaiFloat = floatArrayOf(2.5f,3.0f,2.0f)

    val angkaList = listOf<Int>(1,2,3,4,5)

    val hurufList = listOf<Char>('a','b','c','d','e')

    val nilaiList = listOf<Double>(3.5,4.0,2.5,3.0)

    val namaList = listOf<String>("John","Doe","Jane","Doe")


    val bulanList = listOf<String>("Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember")

    val nilaiListFloat = listOf<Float>(2.5f,3.0f,2.0f)

    val angkaList2 = mutableListOf(1,2,3,4,5)
    angkaList2[1] = 10
    println(angkaList2.toString())

    val hurufList2 = mutableListOf('a','b','c', 'd', 'e')
    hurufList2[1] = 'f'
    println(hurufList2.toString())

    val nilaiList2 = mutableListOf(3.5,4.0,2.5,3.0)
    nilaiList2.add(6.0)
    println(nilaiList2)

    val namaList2 = mutableListOf("John","Doe","Jane","Doe")
    namaList2.removeAt(3)
    println(namaList2)

    val bulanListBaru = bulanList.toMutableList()
    bulanListBaru.add("Januari")
    println(bulanListBaru.toString())


}
