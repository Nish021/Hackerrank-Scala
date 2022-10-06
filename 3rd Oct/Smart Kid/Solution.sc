 import scala.collection.mutable._;
import scala.collection.mutable.ArrayBuffer
import scala.collection.SeqLike
import scala.concurrent.{Await,Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.util.{Try,Success,Failure}
import scala.io.StdIn._
object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
         var t = 0
    t = readInt()
    while(t > 0)
    {
      var in:Array[Int] = readLine().split(" ").map(x => x.toInt);
       var (n,k) = (in(0), in(1)) 
      var arr:Array[Int] = readLine().split(" ").map(x => x.toInt);
      var l = arr.toList.sorted
      var rl = l.reverse
      println((l.take(k).sum - l.drop(k).sum).abs.max((rl.take(k).sum - rl.drop(k).sum).abs));
      t = t -1   
    }
    }
}
