import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;

public class Components extends JButton implements ActionListener{
	private JButton home;
	private JButton office;
	private JButton errands;
	private JTextField textField[] = new JTextField[10];
	private JButton clear[] = new JButton[10];
	private TaskHandler handle = new TaskHandler();
	private Windows win;
	public Components() { //This class basically creates components for the program.
		createClear();
		createFields();
		this.win = win;
		this.handle = handle;
		
	}
	public JButton getHome() {
		home = new JButton("Home");
		home.addActionListener(this);
		return home; 
	}
	public JButton getOffice() {	//Create Task Buttons Home, Office, Errands
		office = new JButton("Office");
		office.addActionListener(this);
		return office;
	}
	public JButton getErrands() {
		errands = new JButton("Errands");
		errands.addActionListener(this); 
		return errands;
	}
	private void createFields() { //Create textFields 
		for (int i = 0; i < 10; i++){
        	
        	 textField[i] = new JTextField("");
             textField[i].setEditable(false);
             textField[i].setFont(new Font("Serif", Font.PLAIN,16));
             textField[i].setColumns(40);
            
        }
		
	}
	public JTextField getField(int index) {
		return textField[index];
	}
	private void createClear() { //createClear
		for(int i = 0; i < 10; i++) {
			clear[i] = new JButton("Clear");
			
			int index = i; //get index of buttons to match index of task/list.
			this.clear[index].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{	
					if (handle.tasks.size() >= index){
						handle.getInfoFromRemove(index);
						handle.tasks.remove(index);
			        }
					
					handle.updateTaskList();
				    //   win.repaint();
				    //  win.revalidate();
				}
			});
				
			}
		}
		
	
	public JButton getClear(int index) {
		return clear[index];
	}
	
	//Open TaskWindows when a task button is pressed.
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == home) {
			
			createWindowHome("Home");
			
		}
		if(e.getSource() == office) {
			
			createWindowOffice("Office");
		}
		if(e.getSource() == errands) {
		
			createWindowErrands("Errands");
		}
	}
	//Create the TaskWindows
	private void createWindowHome(String name) {
		JFrame frame = new TaskWindowH(name);
        frame.setSize(430,420);
    	frame.setLocationRelativeTo(null);
      //  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}
	private void createWindowOffice(String name) {
		JFrame frame = new TaskWindowO(name);
        frame.setSize(430,420);
    	frame.setLocationRelativeTo(null);
      //  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}
	private void createWindowErrands(String name) {
		JFrame frame = new TaskWindowE(name);
        frame.setSize(430,420);
    	frame.setLocationRelativeTo(null);
      //  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}
}
