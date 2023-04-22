fun main(){
    //list-immutable
    var beatles = listOf<String>("paul","john","ringo","george")
    println("List size is ${beatles.size}")

    var ctr:Int =0
    while (ctr<beatles.size) {
        println(beatles[ctr])
        ctr++
    }
    println("********************")
    //list -mutable
    var rivermaya = mutableListOf<String>("Bambo","Rico","Perf","juan")
    //rivermaya.removeAt(0)
   // rivermaya.remove("rico")
   // rivermaya.add("John")
    rivermaya.add(2,"peter")
    var ctr2:Int =0
    while (ctr2<rivermaya.size) {
        println(rivermaya[ctr2])
        ctr2++
    }


}