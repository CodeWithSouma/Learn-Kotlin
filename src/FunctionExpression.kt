// write a programme to check large number between 2 integer
// using function expression

fun maxOf(number1 : Int, number2 : Int)  = if (number1 > number2) number1 else number2
fun main() {
    println("large number between 5 and 6 is ${maxOf(5,6)}")
}