Safe Calls (?.):  
val length: Int? = nullableString?.length

//..............................................................................
Elvis Operator (?:): 
val nonNullString: String = nullableString ?: "Default Value"

fun main() {
  val nameApi = null
  val nameApi = "Nabajyoti"
  val name: String = nameApi ?: "Anynomous"
  println(name)
}
//..............................................................................

Safe Cast Operator (as?): 
val stringValue: String? = nullableString as? String

Not-null assertion operator (!!):
val nullableString: String? = "Hello"
val nonNullString: String = nullableString!! // This line asserts that nullableString is not null
