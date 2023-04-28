fun main() {
    val numbers = mutableListOf<Int>()
    repeat(9) {
        print("Enter Number ${it + 1}: ")
        numbers.add(readLine()?.toInt() ?: 0)
    }

    println("Your Answer")
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            print("${numbers[i * 3 + j]}\t")
        }
        println()
    }
}
