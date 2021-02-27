package inheritence

open class Animals(var legs: Int, var color: String) {
    fun eat():Unit{
        println("I eat food")
    }

    fun sleep():Unit{
        println("I sleep")
    }

    open fun sounds(): Unit{
        println("I make a sound")
    }
}