fun main(){
    var setA = setOf(1,2,3,4,5)
    var setB = setOf(4,5,6,7,8)
    //union
    var unionset =setA.union(setB)
    println("union - $unionset")

    //intersection
    var intersectSet =setA.intersect(setB)
    println("intersection -$intersectSet")

    //difference
    var difSet = setB.subtract(setA)
    println("Difference of set B from set A is $difSet")

    var difSet2 = setA.subtract(setB)
    println("Difference of set A from set B is $difSet2")

    // symmetrict Different
    println("symmetric difference ${difSet.union(difSet2)}")



}