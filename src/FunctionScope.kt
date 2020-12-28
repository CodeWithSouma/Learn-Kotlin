fun main() {
    val myName : String? = null
    // null check
    if (myName != null)
        println(myName)

    // another way using let
    myName?.let { println(myName) }

    // run method
    val string : String = "Souma"
    string.run { println("length of this string \"$this\" : $length") }

 }