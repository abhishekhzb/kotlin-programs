fun main() {
  val str = "abba"
  val result =  str.checkApllindrome()
   if(result){
      println("Pallindrome")
   }else{
      println("Not Pallindrome")
   } 
}

fun String.checkApllindrome():Boolean{
    var revStr = ""
    val str = this
   
    for(i in str.length-1 downTo 0){
        revStr += str[i]
    }
    
    if(str==revStr){
        return true
    }else{
        return false
    }
}
