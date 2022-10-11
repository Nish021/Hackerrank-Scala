//https://www.hackerrank.com/challenges/string-o-permute/problem

object Solution {

    def swap(str: String): String = {
    val result = str.grouped(2).toList.map(x => x.reverse).mkString
    return result
}
    def main(args: Array[String]) {
       
       var t = scala.io.StdIn.readInt()
       for(i <- 1 to t){
       var s = scala.io.StdIn.readLine()
       println(swap(s))
       }
    }
}
