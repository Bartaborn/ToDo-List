import java.awt.Window;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new Windows("ToDoList"); //Extend JFrame in Windows
        frame.setSize(600,600);
    	frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
	}

}
