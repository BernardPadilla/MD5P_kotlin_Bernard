fun main (){
    //variables

    var numberOfUnit: Double =0.0
    var priceperUnit: Double =0.0
    var name: String
    var price1:Double =0.0
    var price2:Double=0.0
    var price3:Double=0.0
    var totalPrice:Double=0.0

    // Input
    println("Please enter your Name :")
    name= readln().toString()
    println("Please Enter your number of Unit :")
    numberOfUnit= readln().toDouble()
    println("Please Eneter Price per Unit:")
    priceperUnit = readln().toDouble()

    //Process
    totalPrice =(numberOfUnit*priceperUnit)
    price1=(totalPrice*0.90)
    price2=(totalPrice*1.05)
    price3=(totalPrice*1.1)

    //output

    println("$name , you could avail the following mode of payment:")
    println("Computed Tuition Fee : $totalPrice")
    println("MODE OF PAYMENT :")
    println("Cash Payment : ${String.format("%.2f",price1)}")
    println("2-Installment:${String.format("%.2f",price2)} ")
    println("3-Installment:${String.format("%.2f",price3)}")
}