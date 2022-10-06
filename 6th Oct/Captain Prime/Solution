import scala.util.matching.Regex 
object Solution {
   def checkPrime(n : Int) : Boolean = {
       if(n <= 1) return false;
       for(i <- 2 until n){
           if(n % i == 0) return false;
       }
       return true;
   }
    def main(args: Array[String]) {
     var n = scala.io.StdIn.readInt
     for(i <- 0 until n) {
     var num = scala.io.StdIn.readLine
     if(num.contains("0"))
     println("DEAD");
     else {
        if(checkPrime(num.toInt)){
            var l:Boolean = true
            for(i <- 1 to num.length - 1)
            {
                var str = num.drop(i)
                // println(str)
                l = l && checkPrime(str.toInt)
            }
            var r:Boolean = true
            for(i <- num.length-1 to 1 by -1)
            {
                var str = num.take(i)
                r = r && checkPrime(str.toInt)
            }
             if(l && r )
             println("CENTRAL")
             else if(l)
             println("LEFT")
             else if(r)
             println("RIGHT")
             else
             println("DEAD")
        }
        else
        println("DEAD")
         
     }
     }
}
}

