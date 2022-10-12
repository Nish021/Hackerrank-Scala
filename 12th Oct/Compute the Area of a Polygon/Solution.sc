//https://www.hackerrank.com/challenges/lambda-march-compute-the-area-of-a-polygon/problem

object Solution {

    def main(args: Array[String]) {
      
    var t = scala.io.StdIn.readInt
    var xypair = List[List[Int]]()
    
     for(i<- 1 to t){
            var xy = scala.io.StdIn.readLine.split(" ").map(_.toInt).toList
            xypair ++= List(xy)
        }
        
        xypair ++= List(xypair(0))
        
     var res = 0.0
     for(i <- 0 until t){
         res = res + (( xypair(i)(0) * xypair(i+1)(1) ) - ( xypair(i)(1) * xypair(i+1)(0) ) )
         
     }
     
        println((res/2).abs)
    
    }
}
