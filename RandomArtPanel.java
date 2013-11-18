import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

  // create RGB color and use to paint the color in each pixel of picture
 public class RandomArtPanel extends JPanel {
   private TreeFunc[] rgbFunc = new TreeFunc[3];
   // construct will set size of the panel
   public RandomArtPanel(int width, int height) {
     setSize(new Dimension(width, height));
     randomColor();
   }
    // get FuncNode and set to array in local variable
   public void randomColor() {
     rgbFunc[0] = new TreeFunc();
     rgbFunc[1] = new TreeFunc();
     rgbFunc[2] = new TreeFunc();
   }
    // override method paint to get location and paint picture
   public void paint(Graphics gr) {
     for (int j = 0; j < getHeight(); j++) {
      for (int i = 0; i < getWidth(); i++) {
       double x = ((((double) i) / getWidth()) * 2.0) - 1.0;
       double y = ((((double) j) / getHeight()) * 2.0) - 1.0;

       double r = rgbFunc[0].randomFunc(x, y);
       double g = rgbFunc[1].randomFunc(x, y);
       double b = rgbFunc[2].randomFunc(x, y);
       // create color and fill to rectangle 
       gr.setColor(new Color(getColor(r), getColor(g), getColor(b)));
       gr.fillRect(i, j, 1, 1);
      }
     }
   }
    // return value of color
  private int getColor(double val) {
    // set value to be in range 0 - 255
    double colorVal  = val+1;
    if (colorVal < 0) {
      colorVal *= -1;
    }
    colorVal =  ((colorVal/2.0) * 255);
    if (colorVal >= 255) {
      colorVal = 255;
    }
    //System.out.println((int)colorVal);
    return ((int)colorVal);
  }
  
  public void printColorFunc(){
   System.out.println("Red   Color ="
     + rgbFunc[0].funcToString());
   System.out.println("Green Color ="
     + rgbFunc[1].funcToString());
   System.out.println("Blue  Color ="
     + rgbFunc[2].funcToString()); 
   System.out.println(" ");
  }
}