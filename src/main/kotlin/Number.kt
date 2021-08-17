fun main(){
    var usia : Byte = 21
    var tinggi : Int = -123
    var rumah : Short = 12223
    var kuku : Long = 12233333L

    println(usia)

    var juju : Float = 11.222F
    println(juju)

    var huhu : Double = 222.3474364643543
    println(huhu)

    var binary : Int = 0b10001
    var hexxx : Int = 0x5e7f55

    print(binary)
    println(hexxx)

    var harga : Long = 1_000090L
    println(harga)

    var bubut : Int = 122
    //conversion boss
    var bill : Int = harga.toInt()

    println(bill)

    var iik : Double = harga.toDouble()
    println(iik)
}