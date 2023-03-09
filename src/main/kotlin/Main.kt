
class Input(line: String) {
    private val words = line.split(" ")
    val command = words[0]
    val args = words.drop(1)
}

fun main(args: Array<String>) {

    while (true) {
        var input = Input(readln())
        when (input.command) {
            "ping" -> println("pong")
            "say" -> println(input.args.joinToString(" "))
            "quit" -> break
            else -> println("Command not recognized.")
        }
    }

}