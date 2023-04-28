fun main() {
    val numbers = IntArray(5)
    println("Enter 5 integers: ")
    for (i in numbers.indices) {
        print("Enter number ${i + 1}: ")
        numbers[i] = readLine()!!.toInt()
    }

    var max = numbers[0]
    var min = numbers[0]

    for (i in 1 until numbers.size) {
        if (numbers[i] > max) {
            max = numbers[i]
        }
        if (numbers[i] < min) {
            min = numbers[i]
        }
    }
    println("Max value is : $max")
    println("Min value is : $min")
}
