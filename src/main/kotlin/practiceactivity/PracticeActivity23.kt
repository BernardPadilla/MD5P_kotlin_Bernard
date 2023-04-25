package practiceactivity

fun main (){
    var num =ArrayList<String>()
    println("Enter Number 1:")
    num.add(readln())
    println("Enter Number 2:")
    num.add(readln())
    println("Enter Number 3:")
    num.add(readln())
    println("Enter Number 4:")
    num.add(readln())
    println("Enter Number 5:")
    num.add(readln())

    var ctr:Int =0
    while (ctr <num.size){
        println(num[ctr])
        ctr++
    }

}