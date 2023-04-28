fun main() {
    val setA = mutableSetOf<Int>()
    val setB = mutableSetOf<Int>()

    println("Values for Set A")
    for (i in 1..5) {
        print("Enter number $i: ")
        val number = readLine()!!.toInt()
        setA.add(number)
    }

    println("\nValues for Set B")
    for (i in 1..5) {
        print("Enter number $i: ")
        val number = readLine()!!.toInt()
        setB.add(number)
    }

    val intersection = setA.intersect(setB)

    println("\nIntersection of the sets: $intersection")
}
