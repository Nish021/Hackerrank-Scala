//https://www.hackerrank.com/challenges/functional-programming-the-sums-of-powers/problem

import scala.math._
import scala.io.StdIn._

object Solution {
    
    def f(x : Int, n:Int, num:Int) : Int = {
    
    var res = x - pow(num,n).toInt
    //base case
    if(res == 0)
    return 1
    
    if(res < 0)
    return 0
    
    //recursive case
    return f(res,n,num+1) + f(x,n,num+1)
    
    }
    def numberOfWays(X:Int,N:Int):Int = {
       return f(X, N, 1)
    }

    def main(args: Array[String]) {
       println(numberOfWays(readInt(),readInt()))
    }
}
