/**
Write a kotlin program that takes a string as input and reverses each word in the string 
while maintaining the original order of words. Provide the algorithm and code to achieve this. 

Note: Do not use inbuild reversed function

Input:    I am good 
Output:   I ma doog
*/

fun main() {
    val input = "I am Good"
    println(reverseString(input))
}

fun reverseString(str :String):String{
    val words = str.split(" ")
    var result = ""
    
    for(word in words){
        var revString = ""
        for(i in word.length-1 downTo 0){
           revString = revString + word[i]
        }
        result = result+" " + revString
    }
  
    return result
}
