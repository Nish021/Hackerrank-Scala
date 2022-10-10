//https://www.hackerrank.com/challenges/prefix-compression/problem


object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    var str1 = scala.io.StdIn.readLine()
    var str2 = scala.io.StdIn.readLine()
    
    var (i,j) = (0,0)
    var (res: String,c : Int) = ("",0)
    
  
    while(i < str1.length && j < str2.length)
    {
        if(str1(i) == str2(j)){
        c = c + 1
        res = res + str1(i)
        }
        else i = str1.length
        
        i = i + 1
        j = j + 1
    }
    
    println(c + " " + res)
    println(str1.length - c + " " + str1.drop(c))
    println(str2.length - c + " " + str2.drop(c))
    
    }
}
