package InputValidation;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InputValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InfoModel myModel = new InfoModel();
        StartFrame myFrame = new StartFrame(myModel);
        myFrame.setTitle("StartFrame");
        myFrame.setVisible(true);
            
    }  
}
