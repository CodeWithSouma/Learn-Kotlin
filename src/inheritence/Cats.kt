package inheritence

class Cats(legs: Int, color: String): Animals(legs,color) {
    fun purr():Unit{
        println("I purr")
    }
}