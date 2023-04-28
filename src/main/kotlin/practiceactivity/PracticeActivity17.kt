fun main() {
    var sum = 0.0
    var count = 0

    while (count < 5) {
        print("Enter a number: ")
        var number = readln().toDouble()
        sum += number
        count++
    }

    var average = sum / 5
    println("The average is: $average")
}
