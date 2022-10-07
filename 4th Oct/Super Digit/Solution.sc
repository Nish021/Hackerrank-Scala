//https://www.hackerrank.com/challenges/super-digit/problem


object Solution {

    def superD(str : String) : String= {
        
        if(str.length == 1)
        return str
        
        return superD(str.split("").map(x => x.toInt).sum.toString)
    }
    def main(args: Array[String]) {
     
     var n = scala.io.StdIn.readLine().split(" ")
     var res = superD(n(0))
     println(superD((res.toInt * n(1).toInt).toString))
     
     }
}
