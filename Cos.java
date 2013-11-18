// class Cos extends function will set variables that inheritance from super class 
public class Cos  extends Function
{
    public Cos(Function function ){
     setExpr ( "(cos*(PI *" + function.getExpr() + ")" );
     setValue  ( Math.cos(Math.PI * function.getValue()) ) ;
    }    
}