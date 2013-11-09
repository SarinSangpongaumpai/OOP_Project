public class FuncTree {
	public  final int MAX_LEVEL = 8;
	public  final int MIN_LEVEL = 4;
	private int height;

	public FuncTree() {
		constructTree();
	}
	
    private void randomHeight(){
    	this.height = (int)(Math.random()*MAX_LEVEL+ MIN_LEVEL);
    }
    
	private void constructTree() {
        randomHeight();
	}
	
	public FuncNode getRoot(){
		return this.root;
	}
}
