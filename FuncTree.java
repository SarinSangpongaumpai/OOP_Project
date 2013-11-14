 <<<<<< HEAD
 // this class will construct tree function that will use to generate art picture
public class FuncTree {
	public  final int MAX_LEVEL = 8;
	public  final int MIN_LEVEL = 4;
    private FuncNode root;
	private int height;
    
	public FuncTree() {
		constructTree();
	}
	// height of tree will be in range MAX_LEVEL to MIN_LEVEL
=======
public class FuncTree {
	public  final int MAX_LEVEL = 8;
	public  final int MIN_LEVEL = 4;
	private int height;

	public FuncTree() {
		constructTree();
	}
	
>>>>>>> parent of 6e3c8b9... FuncTree comment update
    private void randomHeight(){
    	this.height = (int)(Math.random()*(MAX_LEVEL-MIN_LEVEL)+ MIN_LEVEL);
    }
<<<<<<< HEAD
    // random height of tree and set the function in each node of tree
=======
    
>>>>>>> parent of 6e3c8b9... FuncTree comment update
	private void constructTree() {
        randomHeight();
		FuncNode leaf = new FuncNode(null);
		this.root = new FuncNode(leaf);
		
		for (int i = 0; i < this.height-1; i++) {
			FuncNode node = new FuncNode(null);
			leaf.setLeafNode(node);
			leaf = node;
		}
	}
<<<<<<< HEAD
	// return root node of tree .
	public FuncNode getRoot(){
		return this.root;
	}
}
=======
	
	public FuncNode getRoot(){
		return this.root;
	}
}
>>>>>>> parent of 6e3c8b9... FuncTree comment update
