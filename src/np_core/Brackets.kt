//package np_core
//
//import java.util.*
//
//
//internal fun isBalanced(s: String): String {
//    var len = s.length
//    var half = (s.length/2)-1
//    if(len%2==0){
//        var first = s.subSequence(0, half-1)
//        var second = s.subSequence(half+1,len-1)
//        return first.equals(second.reversed()) ? "YES" : "NO"
//    }
//    else{
//        return "NO"
//    }
//}
//
//fun main(args: Array<String>) {
//    var input = Scanner(System.`in`)
//    val t = input.nextInt()
//    for (i in 0..t - 1) {
//
//        val s = input.next()
//        val result = isBalanced(s)
//        println(result)
//    }
//    input.close()
//}