fun main() {


    println("Enter fare:")
    var fare = readLine()?.toDoubleOrNull() ?: 0.0
    println("Please Select Passenger type")
    println("[O] Ordinary")
    println("[S] Student")
    println("[C] Senior Citizen")
    var passengerType = readLine()
    println("Traveling in Business class [Y/N]:")
    var isInBusinessClass = readLine()?.equals("Y", ignoreCase = true) ?: false

    var discount = when (passengerType) {
        "O" -> 0.0
        "S" -> 0.05
        "C" -> 0.1
        else -> 0.0
    }

    var businessClassCharge = if (isInBusinessClass) {
        when (passengerType) {
            "O" -> 1000.0
            "S" -> 700.0
            "C" -> 500.0
            else -> 0.0
        }
    } else {
        0.0
    }

    var discountedFare = fare * (1 - discount)
    var newFare = discountedFare + businessClassCharge

    println("Discount is ${"%,.2f".format(discountedFare * discount)}")
    println("Business class charge is ${"%,.2f".format(businessClassCharge)}")
    println("New fare is ${"%,.2f".format(newFare)}")
}
