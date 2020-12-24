// this function return sum of two number
fun calculateSum(number1 : Int, number2 : Int) : Int{
    return number1 + number2
}

// this function only print sum of two number
fun printSum(number1: Int, number2: Int): Unit{// we can exclude unit return type unit means this function return nothing
    println("Sum of $number1 and $number2 : ${number1 + number2}") // here we use templating for format the string
}


fun main(){
    // val use for defining constant
    // val use for defining variable
   val result = calculateSum(10,20)
    println("Result: $result");
    printSum(4,5)
}