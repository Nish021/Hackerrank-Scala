//https://www.hackerrank.com/challenges/lambda-march-compute-the-perimeter-of-a-polygon/problem

import scala.math._

object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        var n = scala.io.StdIn.readInt()
        var xypair = List[List[Int]]()
        
        for(i<- 1 to n){
            var xy = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList
            xypair ++= List(xy)
        }
        xypair ++= List(xypair(0))
        
        var res = 0.0
        
        for(i <- 0 until n){
            res += pow((pow(xypair(i)(0) - xypair(i+1)(0),2) + pow(xypair(i)(1) - xypair(i+1)(1),2)), 0.5)
             
            
        }
        println(res)
    }
}
