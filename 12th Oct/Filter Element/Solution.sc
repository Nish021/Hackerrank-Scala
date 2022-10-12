//https://www.hackerrank.com/challenges/filter-elements/problem

object Solution {

    def main(args: Array[String]) {
       
       var t = scala.io.StdIn.readInt
       
       for(i <- 1 to t){
       var nk = scala.io.StdIn.readLine().split(" ").map(x => x.toInt)
       var arr = scala.io.StdIn.readLine().split(" ").map(x => x.toInt).toList
       
       var r = arr.groupBy(x => x).mapValues(x => x.length)
      val out = arr.distinct.filter(r(_) >= nk(1))
       var res = ""
       
       for(i <- out){
           res = res + i + " "
       }
      if(out.size == 0)
      println(-1)
      else
      println(res.trim)

       }
    }
}
