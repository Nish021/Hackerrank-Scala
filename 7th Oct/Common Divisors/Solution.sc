//https://www.hackerrank.com/challenges/common-divisors

import scala.math._
object Solution {

    def gcd(a:Int, b:Int) : Int = {
        if(a == 0) b
        else gcd(b%a, a)
    }
    def main(args: Array[String]) {
     var t = scala.io.StdIn.readInt()
        
        for(test <- 1 to t){
        var ml = scala.io.StdIn.readLine().split(" ").map(x => x.toInt)
        
        var n = gcd(ml(0), ml(1))
        var res = 0
        for(i <- 1 to sqrt(n).toInt ){
            
            if(n % i == 0){
                if(n / i == i)
                res = res + 1
                else
                res = res + 2
            }
        }
        
       println(res)  
        }
    
    
    }
}
