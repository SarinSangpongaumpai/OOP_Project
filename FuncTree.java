// class FuncTree that will construct function tree with random height.
public class FuncTree {
    // set max and min level of tree
	public  final int MAX_LEVEL = 8;
	public  final int MIN_LEVEL = 4;
	// local variable int height of tree
	private int height;
    // constructor will create function tree;
	public FuncTree() {
		constructTree();
	}
	// random height of tree and set to local variable
    private void randomHeight(){
    	this.height = (int)(Math.random()*MAX_LEVEL+ MIN_LEVEL);
    }
    // this method will use command to set height of tree and create leaf node in each level 
	private void constructTree() {
        randomHeight();
	}
}
