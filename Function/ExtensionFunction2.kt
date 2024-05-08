//............. Int ..................
fun main() {
  val number = 5
  val squareNumber = number.square()
  println(squareNumber) 
}

fun Int.square():Int{
    return this * this
}
//............. String ................

fun main() {
  val name = "Abhishek"
  val result = name.addTitleKumar()
  println(result)
}

fun String.addTitleKumar():String{
    return "$this Kumar"
}
//...............................

fun main(args: Array<String>) {
    val nameM = "Abhishek";
    val nameF = "Alice"
    
    val result = nameM.addPrefix("male")
    println(result)
     
    val result2 = nameF.addPrefix("female")
    println(result2)
}

fun String.addPrefix(gender :String):String{
  return when(gender){
    "male" -> "Mr $this"
    "female" -> "Miss $this"
     else -> this
  }
}
