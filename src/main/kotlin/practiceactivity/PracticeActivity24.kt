fun main() {
    var sumOfSquares = 0
    var sumOfCubes = 0

    println("Number\t\tSquare\t\tCube")

    for (i in 2..10 step 2) {
        val square = i * i
        val cube = i * i * i
        println("$i\t\t$square\t\t$cube")
        sumOfSquares += square
        sumOfCubes += cube
    }

    println("Total\t\t$sumOfSquares\t\t$sumOfCubes")
}
