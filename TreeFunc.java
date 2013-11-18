// Treefunc will create the tree function and set to set color
public class TreeFunc
{
    private Function leaf;
    private final int MAX_LEVEL = 12;
    private final int MIN_LEVEL = 10;
    private final int NUMBER_VARIABLE  = 2;
    private final int NUMBER_FUNCTION  = 3;
    private int []levelTree;
    private int randomLeaf;
    private boolean hasFunc; 
    // initiallize tree will set hasFunc,height leaf to default
    public TreeFunc(){   
        this.hasFunc = false;
        this.leaf    = null;
    }
    // randomFunc by get x , y and then random leaf ,height and pass to buildTree method
    public double randomFunc(double x , double y){     
        if(!this.hasFunc){
          this.randomLeaf = (int) (Math.random() *NUMBER_VARIABLE  );
          this.levelTree = new int [(int)(Math.random()*(MAX_LEVEL-MIN_LEVEL+1)+ MIN_LEVEL)];
          buildTree(x,y);
          this.hasFunc = true;
        }
        else{
          buildTree(x,y);
        }    
        return this.leaf.getValue();
    }
    // create tree by set leaf and set  function in  each level
    private void buildTree(double x, double y){  
         if(this.randomLeaf == 0){
             this.leaf =  new FunctionResult(x,"x");
          }
          else{
             this.leaf =  new FunctionResult(y,"y");
          }
         setFuncEachLevel(x,y);
    }
    
    private void setFuncEachLevel(double x , double y){
        // set each loop until in reach height of tree
        for (int i = 0; i < levelTree.length-1; i++) {
          // intialize function first by random
          if(!this.hasFunc){
            this.levelTree[i] = (int) (Math.random()*NUMBER_FUNCTION );           
          }
          // wrapper each level put to new function
          if(this.levelTree[i] == 0){
               this.leaf =  new Sin(this.leaf);
          }
          else if(this.levelTree[i] == 1){
               this.leaf =  new Cos(this.leaf);
          } 
          else if(this.levelTree[i] == 2){
            if(this.randomLeaf == 0){
              this.leaf =  new Avg(this.leaf,new FunctionResult(y,"y"));
            }
            else{
              this.leaf =  new Avg(this.leaf,new FunctionResult(x,"x"));
            }
          }
        }
    }
    // return expression of tree
    public String funcToString(){
       return this.leaf.getExpr();     
    }
}
