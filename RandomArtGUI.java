import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class RandomArtGUI extends JFrame {
  private RandomArtPanel panel;
  private JButton randomButton;
  private JButton outPutButton;
  private final int FRAME_SIZE = 450;
  // constructor will create random art panel and two button that will be user in GUI
  public RandomArtGUI() {
   // set size of frame
   getContentPane().setPreferredSize(new Dimension(FRAME_SIZE, FRAME_SIZE));
   getContentPane().setLayout(null);
 
   // create and set location of random art panel
   panel = new RandomArtPanel(FRAME_SIZE, FRAME_SIZE - 50);
   panel.setLocation(0, 0);
   getContentPane().add(panel);
  
    // create randomButton that will use to random new picture
   randomButton = createButton("Random", 150, 25, 50, 415);
   randomButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
     panel.randomColor();
     panel.repaint();
    }
   });
   getContentPane().add(randomButton);

   // create outPutButton that will show function that generate the picture.
   outPutButton = createButton("OutPut", 150, 25, 250, 415);
   outPutButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
     panel.printColorFunc();
    }
   });
   getContentPane().add(outPutButton);
 }

    // create button with specific name, size and location
 private JButton createButton(String text, int width, int height,int locationX, int locationY) {
  JButton button = new JButton(text);
  button.setSize(width, height);
  button.setLocation(locationX, locationY);
  return button;
 }
}
