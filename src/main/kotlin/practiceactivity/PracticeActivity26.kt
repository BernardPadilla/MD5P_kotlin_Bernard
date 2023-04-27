fun main() {
    for (i in 25 downTo 1 step 5) {
        for (j in i downTo i - 4) {
            print("$j\t")
        }
        println()
    }
}
