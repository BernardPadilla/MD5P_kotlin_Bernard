fun main() {
    print("Enter a positive integer: ")
    var n = readln().toInt()

    repeat(n) { i ->
        if (i % 2 != 0) {
            print("$i ")
        }
    }
}
