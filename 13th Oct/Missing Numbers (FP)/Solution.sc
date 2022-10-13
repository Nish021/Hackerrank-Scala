//https://www.hackerrank.com/challenges/missing-numbers-fp/problem

object Solution {
    

    def main(args: Array[String]) {
        
        var n = scala.io.StdIn.readInt
        var a = scala.io.StdIn.readLine().split(" ").map(x => x.toInt).toList
        var m = scala.io.StdIn.readInt
        var b = scala.io.StdIn.readLine().split(" ").map(x => x.toInt).toList
        
        var counta = a.groupBy(x => x).mapValues(x => x.length)
        var countb= b.groupBy(x => x).mapValues(x => x.length)
        
        var out = a.distinct
        var res = List[Int]()
        for(i <- out){
            if (counta(i) < countb(i))
            res = res ++ List(i)
        }
        var r = res.sorted.map(x => x.toString + " ").mkString
        println(r.trim)
              
    }
}
