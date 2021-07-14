
public abstract class Task implements Comparable<Task>, TaskInterface{
private String task;
public String date;


	public Task(String myText,  String date) {
		
		this.date = date;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getTask() {
		 return task; // task represents everything, (date,location,input)
	}

	@Override
	public int compareTo(Task compareTasks) { //Done so that the date is the only thing compared between tasks.
		return date.compareTo(compareTasks.date);
	}
}
