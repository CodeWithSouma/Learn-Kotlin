// this function return sum of two number
fun calculateSum(number1 : Int, number2 : Int) : Int{
    return number1 + number2
}

// this function only print sum of two number
fun printSum(number1: Int, number2: Int): Unit{// we can exclude unit return type unit means this function return nothing
    println("Sum of $number1 and $number2 : ${number1 + number2}") // here we use templating for format the string
}

// default value in function
fun greet(greet:String = "Good Morning",name:String){
    println("Hello!!! $name $greet")
}

// higher order function
fun calculator(number1: Int, number2: Int, operator: (Int, Int) -> Int):Int{
 return operator(number1 , number2)
}


fun main() {
    // val use for defining constant
    // val use for defining variable
    val result = calculateSum(10, 20)
    println("Result: $result")
    printSum(4, 5)
    greet(name = "Souma")// no need to pass first argument
    greet(name = "Soumaik", greet = "Good Evening")//when you pass named argument then you don't need to maintain sequence of parameter

    // higher function in kotlin
    val sum = calculator(5, 6, {a , b -> a + b} )
    println(sum)
}