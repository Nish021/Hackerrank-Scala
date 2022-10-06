object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    var str = scala.io.StdIn.readLine()
     println(str.foldLeft("")((res , x) => if(res.contains(x)) res else res + x))
        
    }
}
