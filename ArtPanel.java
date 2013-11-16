// Sarin Sangpongaumpai fixed
package Sarin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;


  
  setSize(new Dimension(width, height));
 }
 
 public void setRGBExpr(int rgb, ExprNode expr) {
  rgbExpr[rgb] = expr;
 }
 
 @Override
 public void paint(Graphics gr) {
  for (int j = 0; j < getHeight(); j++) {
   for (int i  * 2.0) - 1.0;
    
    do(x, y);
    double b = rgbExpr[2].evaluate(x, y);
    
    Color c = new Color(toColor(r), toColor(g), toColor(b));
    gr.setColor(c);
    gr.fil
   col = 255;
  }
  return col;
 }
}
