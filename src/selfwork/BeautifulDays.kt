package selfwork

import java.util.*

/**
 * Created by oluwalekefakorede on 6/13/17.
 */
fun showDay(day1 : Int, day2 : Int, k : Int ) : Int{
    var array = ArrayList<Int>()
    for(i in day1..day2){
//        println("this"+ i)
        var rev = i.toString().reversed().toInt()
        if(removeMinus(i - rev) %k == 0){
            array.add(i)
        }
    }
    return array.size
}
fun removeMinus(number : Int) : Int{
    var num = number.toString()
    if (num.contains("-")){
        num = num.replace("-","")
        return num.toInt()
    }
    else{
        return number
    }
}

fun main(args : Array<String>){
    var input = Scanner(System.`in`)
    var day1 = input.nextInt()
    var day2 = input.nextInt()
    var k = input.nextInt()
    print(showDay(day1,day2,k))
//    println(removeMinus(-45))
}