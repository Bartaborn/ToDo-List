import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;

public class TaskHandler{
	private Task output;
	static ArrayList<Task> tasks = new ArrayList<>(10);
	public TaskHandler() {
		
	}
	public static void addText(ArrayList<JTextField> list) {
		for(int i = 0; i < TaskHandler.tasks.size();i++) {
			list.get(i).setText(TaskHandler.tasks.get(i).getTask());
			
		} //Get task basically, used to copy to textArray in taskWindow
	}
	
	 public void updateTaskList() { //Update method which sorts and prevents text to stay in an empty array slot.
		 
		 for(int x=0; x<Windows.textList.size();x++) {
			 Windows.textList.get(x).setText("");
			 }
		 Collections.sort(tasks);
		 int y = 0;
		 for(int i= 0; i < Windows.textList.size(); i++) {
			 if(y < tasks.size()) {
				 Windows.textList.get(i).setText(tasks.get(y).getTask());
			 }
			 else {
				 Windows.textList.get(i).setText("");
			 }
			 y++;
		  }
		 Collections.sort(tasks);
		  y = 0;
		 for(int i= 0; i < Windows.textList.size(); i++) {
			 if(y < tasks.size()) {
				 Windows.textList.get(i).setText(tasks.get(y).getTask());
			 }
			 else {
				 Windows.textList.get(i).setText("");
			 }
			 y++;
		  }    
	        for (int i = 0 ; i < tasks.size(); i++ ){
	            Windows.textList.get(i).setText(tasks.get(i).getTask());
	        }
	        
	}     
	
	 public void getInfoFromRemove(int index) { //info and count after a remove
		 Windows.info.setText("Last removed task: "+tasks.get(index).getTask());
		 Windows.taskCounter.setText("List contains of: "+(TaskHandler.tasks.size()-1)+" tasks");
		 
	 }
	 public static void getInfoFromInput() { //Info and count after an added task.
		 if(tasks.size()==10) {
			 Windows.taskCounter.setText("Full List");
		 }
		 else {
			 Windows.taskCounter.setText("List contains of: "+tasks.size()+" tasks");
			 Windows.info.setText(("Last added task: "+ tasks.get(tasks.size()-1).getTask()));
		 }
	 }
}
	


