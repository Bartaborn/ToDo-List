import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Windows extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel number;
	static JLabel taskCounter = new JLabel(""); 
	static JLabel info = new JLabel("");
	Components b = new Components();
	static ArrayList<JTextField> textList = new ArrayList<JTextField>(10);
	public Windows(String name) {
		super(name);
		Border border = BorderFactory.createLineBorder(Color.RED, 1); // creates a border
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(25,15,10,15));
		contentPane.setLayout(new BorderLayout(0,25));
		contentPane.setBackground(Color.LIGHT_GRAY);
		setContentPane(contentPane);
		
		JPanel topPanel = new JPanel(); //Top Panel for Task buttons
		contentPane.add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		topPanel.setBackground(Color.DARK_GRAY);
		topPanel.add(b.getHome());
		topPanel.add(b.getOffice());
		topPanel.add(b.getErrands());
		
		topPanel.setBorder(border);//add created border
		
		JPanel contentPanel = new JPanel(); //A content panel for textfields where tasks go.
		contentPane.add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		for(int i = 0; i < 10; i++) {
		
		contentPanel.add(b.getField(i)); //Add Fields to window
		textList.add(b.getField(i));	//Add Fields to the array textList
		contentPanel.add(b.getClear(i)); // add Clear Buttons to Window.
		
		number = new JLabel(""+(i+1));
		contentPanel.add(number); //Label each task from 1-10
		
		}
		contentPanel.add(info); //Latest action shown on the window
		
		JPanel countPanel = new JPanel();
		contentPane.add(countPanel, BorderLayout.SOUTH);
		countPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		countPanel.add(taskCounter); //Lower panel for the task counter to be.
	}
	
}
