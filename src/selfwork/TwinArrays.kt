package selfwork

import java.util.*
var input =  Scanner(System.`in`)
fun main (args : Array<String>){
    val firstArray = ArrayList<Int>()
    val secondArray = ArrayList<Int>()
    var size = input.nextInt()
    for(i in 1..size){
        firstArray.add(input.nextInt())
    }
    for(i in 1..size){
        secondArray.add(input.nextInt())
    }
    var fArray = ArrayList<Int>()
    var sArray = ArrayList<Int>()
    fArray.addAll(firstArray)
    sArray.addAll(secondArray)
    fArray.sort()
    sArray.sort()
    var firstS = fArray[0]
    var secondS = sArray[0]
    if(firstArray.indexOf(firstS) == secondArray.indexOf(secondS)){
        if(fArray[1] > sArray[1]){
            println(fArray[0]+ sArray[1])
        }else{
            println(fArray[1]+sArray[0])
        }
    }else{
        println(firstS+secondS)
    }
}
