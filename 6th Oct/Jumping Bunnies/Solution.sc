object Solution {

    def main(args: Array[String]) {
     
         var n=scala.io.StdIn.readInt()
        var l=scala.io.StdIn.readLine().split(" ").map(_.toLong)
        
        def lcm(a:Long,b:Long):Long={
            def gcd(c:Long,d:Long):Long={
                if(d==0) c
                else gcd(d,(c%d))
            }
            var lc=((a*b)/gcd(a,b)).toLong
            lc
        }
        
        var out=lcm(l(0),l(1))
        //println(out)
        if(n==2){
          //  print(out)
            System.exit(0)
        }
        else{
            for(i<- 2 to l.length-1){
                println(out, l(i))
                if(i == l.length-1 )
                out = out
                else
                out=lcm(out,l(i))
            }
        }
        print(out)
        
    }
}
