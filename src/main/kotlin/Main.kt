fun main(args: Array<String>) {

    while (true) {
        var command = readln()

        when (command) {
            "ping" -> println("pong")
            "quit" -> break
            else -> println("Command not recognized.")
        }
    }

}