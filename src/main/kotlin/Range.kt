fun main() {
    //val num = 1..1000

    val num = 1000 downTo 1 step 6
    val mun = 1..100 step 2

    println(num.contains(1500))
    println(num.count())
    println(num.contains(222))
    println(num.first)
    println(num.last)
    println(num.step)

    println(mun.last)
}