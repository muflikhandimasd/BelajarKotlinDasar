fun main() {
    val names : Array<String> = arrayOf("Muflikhan", "Joko", "Budi")

    //names.set(0, "bau")

    names[0] = "Rudi"
    println(names[0])

    val nilai : Array<Int> = arrayOf(10,5,6)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    val jack : Array<String?> = arrayOfNulls(4)
    jack[0] = "Muflikhan"
    jack[1] = "Dimas"

    println(jack[0])
    println(jack[1])
    println(jack[2])
    println(jack.size)
}