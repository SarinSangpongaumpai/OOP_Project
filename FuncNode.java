public class FuncNode {
        private String expr; //expression
        private FuncNode leafNode;
        private Function func; //function
        private final int NUMBER_FUNCTION = 2; //SIN and COS
        private final int NUMBER_VARIABLE  = 2; // x and y
        private int random;
  
public FuncNode(FuncNode leafNode) {
                setLeafNode(leafNode);
        }
  
public void setLeafNode(FuncNode leafNode) {
                this.leafNode = leafNode;
                random();
        }
        
 private void random() {
                if (this.leafNode == null) {
                        this.random = (int) (Math.random() * NUMBER_FUNCTION + NUMBER_VARIABLE);
                }
                else {
                        this.random = (int) (Math.random() * NUMBER_FUNCTION);
                }
        }

public double calculate(double x, double y) {
                switch (this.random) {
                case 0:
                        this.expr = func.SIN.toString()+"(PI*y" ;
                        return Math.sin(Math.PI * x * this.leafNode.calculate(x, y));
                case 1:
                        this.expr = func.COS.toString()+"(PI*x" ;
                        return Math.cos(Math.PI * y * this.leafNode.calculate(x, y));
                case 2:
                        this.expr = "x";
                        return x;
                default:
                        this.expr = "y";
                        return y;
                }
        }
       
 // return string of expression
        public String funcToString() {
                if (this.leafNode != null) {
                        return   this.expr +"*"+ this.leafNode.funcToString() + ")";
                } else {
                        return "("+ this.expr +")";
                }
        }

// enum class use to create the function
        private enum Function {
                SIN, COS  ;
}

}
