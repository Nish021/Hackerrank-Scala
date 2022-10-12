//https://www.hackerrank.com/challenges/fibonacci-fp/problem
object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    var mod = 100000007
    var t = scala.io.StdIn.readInt
    
    for(i <- 1 to t){
    var n = scala.io.StdIn.readInt
    var dp = new Array[Int](n+4)
    
    dp(0) = 0
    dp(1) = 1
    
    for(i <- 2 to n){
    dp(i) = dp(i-1)%mod + dp(i-2)%mod
    }
    
    println(dp(n)%mod)
    
    }
    }
}
