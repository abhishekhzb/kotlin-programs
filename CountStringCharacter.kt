//count every character of Str

fun main() {
  val str = "Abhishek Kumar"
  val result = countCharacter(str)  
  println(result)
}

fun countCharacter(str:String):HashMap<Char,Int>{
    val map = HashMap<Char,Int>()
    
    for(ch in str){
        val count = map[ch]
        if(count == null){
          map[ch] = 1
        }else{
          map[ch] = count + 1
        }
        
    }
    
    return map
}
