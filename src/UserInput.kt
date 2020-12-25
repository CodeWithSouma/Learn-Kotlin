import java.util.*

// write a programme to check weather a number is even or odd
fun isEven(number :Int):Boolean{
    return number % 2 == 0
}

fun main() {
    val number: Int
    val scanner = Scanner(System.`in`)
    print("Enter a number: ")
    number = scanner.nextInt();

    if (isEven(number))
        println("Number $number is Even number")
    else
        println("Number $number is Odd number")
}