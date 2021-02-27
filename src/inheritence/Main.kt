package inheritence

fun main() {
    val dog : Dogs = Dogs(4,"Black")
    val cats : Cats = Cats(4,"White")

    dog.eat()
    dog.sleep()
    dog.sounds()

    cats.eat()
    cats.sleep()
    cats.sounds()

}

