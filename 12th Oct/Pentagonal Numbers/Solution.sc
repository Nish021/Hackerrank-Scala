//https://www.hackerrank.com/challenges/pentagonal-numbers/problem

object Solution {

    def main(args: Array[String]) {
       
       var t = scala.io.StdIn.readInt()
       
       for(i <- 0 until t){
       var n = scala.io.StdIn.readLong()
       println(((3*n*n) - n)/2)
       }
         
    }
}
