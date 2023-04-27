fun main() {
    print("Enter matrix to generate (n by n): ")
    val n = readLine()!!.toInt()

    var count = n * n
    for (i in 1..n) {
        for (j in 1..n) {
            print("$count\t")
            count--
        }
        println()
        if (n % 2 == 0 && i == n / 2) {
            count -= n
        } else if (i == (n + 1) / 2) {
            count -= n - 1
        }
    }
}
