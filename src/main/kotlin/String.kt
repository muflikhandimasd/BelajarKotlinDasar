fun main() {
    var ujuk : String = "Muflikhan"
    var LastName : String = "Dimas"
    var ujuujj : String = """
        >Hello world'
        >My name is Muflikhan,
        >What is your name?
    """.trimMargin(">")

    println(ujuk)
    println(ujuujj)

    var fullName : String = ujuk + " " + LastName

    var desc : String = "$fullName panjang = ${fullName.length}"
    println(desc)
}