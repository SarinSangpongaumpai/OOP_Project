
// FunctionResult will set  variables that inheritance from super class
public class FunctionResult extends Function
{
    public FunctionResult(double value , String func)
    {
        setValue(value);
        setExpr(  "("+func+")" );
    }    
}
