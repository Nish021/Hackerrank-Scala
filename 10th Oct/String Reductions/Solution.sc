//https://www.hackerrank.com/challenges/string-reductions/problem

import scala.collection.immutable._
  

object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/ var str = scala.io.StdIn.readLine()
    
    var set1 : String = ""
    
    
    for(i <- 0 until str.length)
    {
       if(set1.contains(str(i)))
       set1 = set1
       else
       set1 = set1 + str(i)
    }
    
    println(set1)
    
    
    }
}
