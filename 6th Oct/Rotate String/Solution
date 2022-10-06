object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/

        var t = scala.io.StdIn.readInt;
       
       while( t > 0)
       {
        var str = scala.io.StdIn.readLine()
        
        if(str.length == 1){
        println(str)
        }
        else{
        for( i <- 1 to str.length)
        {
            var t = str
            var res = t.drop(1) + t.take(1)
            str = res
            print(res + "\t")
        }
        
        print("\n")
           t = t -1
       }
        
    }
    }
}
