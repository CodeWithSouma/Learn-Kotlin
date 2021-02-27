package inheritence

// Dogs class inherit animal class
class Dogs(legs: Int, color: String ) : Animals(legs,color) {

    fun bark(): Unit{
        println("I bark")
    }
}