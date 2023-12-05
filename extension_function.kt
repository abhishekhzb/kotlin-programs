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
