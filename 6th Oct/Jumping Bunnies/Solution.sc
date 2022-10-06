object Solution {

   def gcd(a:Long, b:Long) : Long= {
        
            if ( b == 0 ) return a 
            else  return gcd(b, a%b)
    }
    
    def lcm(a : Array[Int], i : Int) : Long  = {
        
        if(i == a.size - 1 ) return a(i)
        
        return (a(i) * lcm(a, i+1)) / gcd(a(i), lcm(a, i+1))
    }
    def main(args: Array[String]) {
     
        var n = scala.io.StdIn.readInt;
        var a = scala.io.StdIn.readLine().split(" ").map(x => x.toInt)
        var b = 0
        println(lcm(a,b))
        
    }
}
