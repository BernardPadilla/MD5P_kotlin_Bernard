fun main() {
    val athleteSalesMap = mutableMapOf<String, Double>()

    for (i in 1..5) {
        print("Enter athlete $i: ")
        val athlete = readLine()!!
        print("Enter sales: ")
        val sales = readLine()!!.toDouble()
        athleteSalesMap[athlete] = sales
    }

    println("\nTop Sports Man")
    println("Name\t\tSales")
    println("===================================")

    val sortedAthletes = athleteSalesMap.entries.sortedByDescending { it.value }
    var totalSales = 0.0

    for (entry in sortedAthletes) {
        println("${entry.key}\t\$${entry.value}")
        totalSales += entry.value
    }

    println("===================================")
    println("Total\t\t\$$totalSales")
}
