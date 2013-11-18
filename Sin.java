
/**
 * class Sin will set variables that extends from super class 
 */

public class Sin  extends Function
{
    public Sin(Function function ){
     setExpr ( "(sin*(PI *" + function.getExpr() + ")" );
     setValue  (Math.sin(Math.PI * function.getValue())) ;
    }    
}
