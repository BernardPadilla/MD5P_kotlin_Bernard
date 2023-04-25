package practiceactivity

fun main() {
   var price:Double=0.0

    //input
    println("Enter Product:")
    var product = readln()
    println("Enter price :")
    price = readln().toDouble()

    if (price <=10000.0){
        var netPrice=price
        var discount=price*0
        println("the price of the $product")
        println("Discount is $discount ")
        println("Net price is $netPrice ")
    }else if(price <= 20000.0){
        var discount=(price*0.05)
        var netPrice= (price-discount)
        println("the price of the $price")
        println("Discount is $discount ")
        println("Net price is $netPrice ")
    }else if (price <= 50000.0) {
        var discount = (price * 0.10)
        var netPrice = (price - discount)
        println("the price of the $price")
        println("Discount is $discount ")
        println("Net price is $netPrice ")
    }else if (price <= 100000.0) {
        var discount = (price * 0.15)
        var netPrice = (price - discount)
        println("the price of the $price")
        println("Discount is $discount ")
        println("Net price is $netPrice ")
    }else if (price > 100000.0) {
        var discount = (price * 0.20)
        var netPrice = (price - discount)
        println("the price of the $price")
        println("Discount is $discount ")
        println("Net price is $netPrice ")
    }



}