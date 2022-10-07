//https://www.hackerrank.com/challenges/string-mingling/problem
object Solution {

    def main(args: Array[String]) {
      var s1 = scala.io.StdIn.readLine()
       var s2 = scala.io.StdIn.readLine()
       
     for ( i <- s1 zip s2 )
            print(""+i._1+i._2)
    }
}
