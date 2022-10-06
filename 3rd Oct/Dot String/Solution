object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
         var str = scala.io.StdIn.readLine()
      str = str.toLowerCase()
      var toRemove = "aeiyou".toSet
      var word = str.filterNot(toRemove)
      var res : String = ""
      for(i <- 0 until word.length){
         res = res + "." + word.charAt(i) 
      }
      print(res)
    }
}
