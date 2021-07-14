import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TaskWindowE extends JFrame {
	private JPanel contentPane;
	private String input;
	private String inputDate;
	private JTextField tasKtext;
	private JTextField textd;
	private Task output;
	private JButton bAdd;
	private TaskHandler handle;
	
	
	public TaskWindowE(String name) {
		super(name);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(25,15,10,15));
		contentPane.setLayout(new BorderLayout(0,25));
		contentPane.setBounds(0,0,0,0);
		setContentPane(contentPane);
		
		JPanel panel_t = new JPanel();
		contentPane.add(panel_t,BorderLayout.CENTER);
		panel_t.setLayout(new FlowLayout(FlowLayout.CENTER,15,40));
		panel_t.setBackground(Color.LIGHT_GRAY);
		JLabel task = new JLabel("Task ");
    	panel_t.add(task);
    	tasKtext = new JTextField("");
        tasKtext.setEditable(true);
        tasKtext.setFont(new Font("Serif", Font.PLAIN,22));
        tasKtext.setColumns(18);
        panel_t.add(tasKtext);
        
        JLabel date = new JLabel("Date ");
     	panel_t.add(date);

		 textd = new JTextField();
         textd.setEditable(true);
         textd.setFont(new Font("Serif", Font.PLAIN,22));
         textd.setColumns(18);
         
         panel_t.add(textd);
         bAdd = new JButton("Add");
         bAdd.setFont(new Font("Serif", Font.TRUETYPE_FONT,22));
         this.bAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					if(TaskHandler.tasks.size() < 10) { //Preventing user from getting errors when having a full list.
						 //TaskHandler.getInfoFromInput();
					output = new Errands(getInput(),getDate()); //get input and date to task, (getTask())
					TaskHandler.tasks.add(output); //add input to list of tasks
					TaskHandler.getInfoFromInput();
						 Collections.sort(TaskHandler.tasks); //Get sorted once added
						 TaskHandler.addText(Windows.textList);// copy input to textfields
						 repaint();
					     revalidate();
					dispose();
					}else {
					JOptionPane.showMessageDialog(new JFrame(), "It's full");
					dispose();
					}
				}
			});
         panel_t.add(bAdd);
      
	}
	
	private String getInput() { //get input
		
		 input = tasKtext.getText();
		 System.out.println(input);
		return input;
	}
	private String getDate() { //get date
		 inputDate = textd.getText();;
		 return inputDate;
	}
}
