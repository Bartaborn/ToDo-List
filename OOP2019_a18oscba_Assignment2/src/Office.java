
public class Office extends Task {
	private static final String location = "Office"; 
	public Office(String myText, String date) {
		super(myText, date);
		setTask("["+location+": "+date+": ]"+myText); //What getTask returns
	}

}
