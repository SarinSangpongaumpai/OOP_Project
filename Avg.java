// class Avg will set variables that inheritance from super class
public class Avg  extends Function
{
    public Avg(Function functionA ,Function functionB){
     setExpr  ( "(avg ("+ functionA.getExpr() + ","+ functionB.getExpr() + ") )" ) ;
     setValue ( (functionA.getValue() + functionB.getValue() )/2 ) ;
    }    
}