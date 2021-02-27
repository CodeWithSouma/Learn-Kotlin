package Interface

class CallMe: MyInterface, NewInterface {
    override fun hello() {
        println("Function hello is called here")
    }

    override fun greeting() {
        println("New greeting can be given here")
    }

    override fun newMethods() {
        println("New methods called here")
    }
}