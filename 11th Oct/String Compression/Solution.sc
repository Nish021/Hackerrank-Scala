object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    var str = scala.io.StdIn.readLine()
    var res = "" +str(0)
    var count = 1
    
    for(i <- 1 until str.length){
        
        if(str(i) == str(i-1)){
            count = count + 1
        }
        else{
            if(count == 1)
            res = res + str(i) 
            else{
            res = res + count.toString + str(i)
            count = 1
            }
        }
        
        // println(count)
    }
    
    if(count > 1 ) res = res + count.toString
    
    println(res)
    
    }
}
