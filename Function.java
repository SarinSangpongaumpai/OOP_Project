
/**
 *  Function class will using to contain get , set method and inherit to subclass
 */
public abstract class Function
{
    private String expr;
    private double value;  
    
    public  String getExpr(){
      return this.expr;
    }
     public  void setExpr(String expr){
      this.expr = expr;
    }
    
    public  double getValue(){
     return this.value;
    }
    public  void setValue(double value){
     this.value = value;
    }

    
}
