fun main (){

    //if else Statement
    var age :Int=0

    //18 Pataas-display
    //17 pababa  - Do not display
    // <> <= >= == !=
    println("Please Enter your Age")
    age= readln().toInt()

    if(age > 17){
        println("your Age is $age")
        println("you are qualified to vote")

    }else{
        println("your Age is $age")
        println("Not qualified to vote")
    }
    println("")

    println("This Will Always Display")


}