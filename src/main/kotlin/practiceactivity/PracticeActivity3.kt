fun main (){

    //Variables
    var price1:Double =0.0
    var price2:Double=0.0
    var price3:Double=0.0
    var average:Double= 0.0
    var item:String


    //Input
    println("Eneter the Name Of the ITEM :")
    item= readln().toString()
    println("Enter Price in day 1:")
    price1= readln().toDouble()
    println("Enter Price in day 2:")
    price2= readln().toDouble()
    println("Enter Price in day 3:")
    price3= readln().toDouble()

    //Process
    average=(price1+price2+price3)/3

    //output
    println("The average price of $item is ${String.format("%.2f",average)} per gallon ")

}