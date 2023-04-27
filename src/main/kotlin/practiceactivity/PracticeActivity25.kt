fun main() {
    print("Enter base size of dollar triangle: ")
    val baseSize = readLine()?.toIntOrNull() ?: return
    for (i in 1..baseSize) {
        for (j in i until baseSize) {
            print(" ")
        }
        for (j in 1..i) {
            print("$")
        }
        println()
    }
}
