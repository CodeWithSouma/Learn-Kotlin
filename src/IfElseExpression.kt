import java.util.*

// write a programme to check large number between two number using If-Else
// expression
fun main() {
    val scanner  = Scanner(System.`in`)
    print("Enter two number: ")
    val number1 = scanner.nextInt()
    val number2 = scanner.nextInt()
    val largeNumber = if (number1 > number2) number1 else number2

    println("large number between $number1 and $number2 is: $largeNumber")
}