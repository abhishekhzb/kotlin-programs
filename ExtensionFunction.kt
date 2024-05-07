//............. Int ..................
fun main() {
  val number = 5
  val squareNumber = number.square()
  println(squareNumber) 
}

fun Int.square():Int{
    return this * this
}
/............. String ................

fun main() {
  val name = "Abhishek"
  val result = name.addTitleKumar()
  println(result)
}

fun String.addTitleKumar():String{
    return "$this Kumar"
}
