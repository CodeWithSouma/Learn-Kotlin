import java.util.function.Consumer

fun main() {
    val list = listOf<Int>(1,2,3,4,5,10,12,15)
    val filteredList = list.filter { num -> num > 10 }
    filteredList.forEach( Consumer { num -> print("$num ") })
    println()
}