// Sarin Sangpongaumpai fixed
package Sarin;

import java.util.Random;

public class ExprBuilder {

    public static final int MAX_LEVEL = 4;
    public static final int MIN_LEVEL = 1;
    private Random rand;
    private int height;

    public ExprBuilder() {
        rand = new Random();
        height = rand.nextInt();
     {
            ExprNode node = new ExprNode(null);
            leaf.setNode(node);
            leaf = node;
        }
        return root;
    }
}
