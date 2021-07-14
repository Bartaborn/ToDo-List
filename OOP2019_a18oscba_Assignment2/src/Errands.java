
public class Errands extends Task {
	public static final String location = "Errands"; 
	public Errands(String myText, String date) {
		super(myText, date);
		setTask("["+location+": "+date+": ]"+myText); //What getTask returns
	}
	
}
