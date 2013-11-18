
/**
 * class main use to create the RandomArtGUI class
 */
public class main
{
    public static void main(String[]args){
        RandomArtGUI gui = new RandomArtGUI();
        gui.setTitle("Random Art");
        gui.setDefaultCloseOperation(gui.EXIT_ON_CLOSE);
        gui.pack();
        gui.setVisible(true);
    }
}
