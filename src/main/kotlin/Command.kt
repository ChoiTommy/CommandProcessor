import kotlin.system.exitProcess

class Command(command: String, args: List<String>) {
    private val name: String = command
    val operation = when(name) {
        "ping" -> { println("pong") }
        "say" -> { println(args.joinToString(" ")) }
        "quit" -> { exitProcess(0) }
        "add" -> {
            println(args.sumOf { it.toDouble() })
        }
        "subtract" -> {
            println(args[0].toDouble() - args.drop(1).sumOf { it.toDouble() })
        }
        else -> { println("Command not recognized.") }
    }
}