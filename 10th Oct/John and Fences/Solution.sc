//https://www.hackerrank.com/challenges/john-and-fences/problem?isFullScreen=true


import scala.collection.mutable._

object MyClass {

    def PSE(arr : Array[Int], n :Int) :Array[Int] = 
    {
    
    var s =  Stack[Int]();
    s.push(-1)
    
    var ans = new Array[Int](n)
    
    
    for(i <- 0 until n)
    {
    
    var curr = arr(i)
    
    while(s.top != -1 && arr(s.top) >= curr)
    {
    s.pop
    }
    ans(i) = s.top 

    s.push(i) 

    }
    
    
    return ans
    }
    
    
    def NSE(arr : Array[Int], n :Int) :Array[Int] = 
    {
    
    var s =  Stack[Int]()
    s.push(-1)
    
    var ans = new Array[Int](n)
    
    for(i <- n-1 to 0 by -1){
    
    var curr = arr(i)
    
    while(s.top != -1 && arr(s.top) >= curr){
    s.pop
    }
    ans(i) = s.top
    s.push(i) 
    

    
    }
    
    return ans
    }




    def getMaxArea(arr : Array[Int], n :Int): Int = 
    {
    
    var next = new Array[Int](n)
    next = NSE(arr,n)
    
    var prev = new Array[Int](n)
    prev = PSE(arr,n)
    
    var res = -1
    
        for(i <- 0 until n)
        {
        
        var l = arr(i)
        var b = 0
        if(next(i) == -1)
        next(i) = n
        

        res = (res).max(l*(next(i) - prev(i) -1))
        
        }
        
        return res
    }
    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    var n = scala.io.StdIn.readInt()
    var arr = scala.io.StdIn.readLine.split(" ").map(x => x.toInt)
    
    var res = getMaxArea(arr,n)
    println(res)
        }
}
