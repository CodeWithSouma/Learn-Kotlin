// When Expression works similar like switch case
fun main() {
    var name = "Souma"
    when(name){
        "Souma" -> {
            println("Souma is Android Developer")
        }
        "Arijit" -> {
            println("Arijit is a Python Developer")
        }

        else -> println("Hello $name")
    }
}