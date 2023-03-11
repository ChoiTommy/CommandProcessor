class Input(line: String) {
    private val words = line.split(" ")
    private val args = words.drop(1)
    val command = Command(words[0], args)
}