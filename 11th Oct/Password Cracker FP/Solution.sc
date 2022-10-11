//https://www.hackerrank.com/challenges/password-cracker-fp/problem

import scala.io.StdIn._

object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
            var t=readInt
            for(i<- 1 to t){
        
            var n = readInt
            var passwords = readLine.split(" ")
            var pattern = readLine
            
            var (res, temp, flag) = ("", "", -1)
            var map : Map[String, Int] = Map()
            
            for(i <- 0 until n){
                map += (passwords(i) -> i)
            }

            // println(map)
            
            for(i <- 0 until pattern.length){
                
                temp = temp + pattern(i)
                flag = 0
                
                if(map.contains(temp)){
                    res = res + temp + " "
                    temp = ""
                    flag = 1
                }
            }
            
            if(flag == 0) println("WRONG PASSWORD")
            else println(res.trim)

            }
    }
}
