package selfwork

/**
 * Created by oluwalekefakorede on 17/06/2017.
 */
fun adder(num : Int) : Int{
    var array = num.toString().toCharArray()
    var sum = 0
    for (i in 0..array.size-1){
//        sum +=
        println(array[i].toInt())
    }
    return sum
}
fun main(word : Array<String>){
    print(adder(40))
}
