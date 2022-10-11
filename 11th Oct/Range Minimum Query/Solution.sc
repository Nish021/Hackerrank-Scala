object Solution {

    def buildTree(tree : Array[Int], a : Array[Int], index : Int, start : Int, end : Int) : Unit = {
        
        
        //base case
        if(start >  end) return ;
        //base case for leaf node
        if(start ==  end){
            tree(index) = a(start)
            return ;
        }
        
        //recursive case
        
        var mid = (start + end)/2
       
        //left subtree
        buildTree(tree,a,2*index,start,mid)
         
        //right subtree
        buildTree(tree,a,2*index + 1, mid + 1, end)
        
        //logic
        // println(index)
        tree(index) = tree(2*index).min(tree(2*index + 1))
        
    }
    
    def query(tree : Array[Int], index : Int, start : Int, end : Int, queryStart : Int, queryEnd: Int) : Int= {
        
        //No Overlap
        if(queryStart > end || queryEnd < start){
            return Int.MaxValue
        }
        
        //Complete Overlap
        if(start >= queryStart && end <= queryEnd){
            return tree(index)
        }
        
        //No Overlap
        var mid = (start + end)/2
        var left = query(tree, 2*index,start,mid,queryStart, queryEnd)
        var right = query(tree, 2*index + 1, mid+1, end, queryStart, queryEnd)
        
        return left.min(right)
    }
    def main(args: Array[String]) {
       
        var nm = scala.io.StdIn.readLine().split(" ").map(x => x.toInt)
        var arr = scala.io.StdIn.readLine().split(" ").map(x => x.toInt)
        
        //Build the tree array
        var tree = new Array[Int](4*nm(0) + 1)
        
        // tree(0) = 0
        buildTree(tree,arr,1,0,nm(0)-1)
        for(i <- 0 until nm(1)){
            
            var se = scala.io.StdIn.readLine().split(" ").map(x => x.toInt)
            
            //query
            println(query(tree, 1, 0, nm(0)-1,se(0),se(1)))
            
        }
    }
}
