import java.text.SimpleDateFormat;

public class Home extends Task {
	//private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	private static final String location = "Home"; 
	public Home(String myText, String date) {
		super(myText, date);
		setTask("["+location+": "+date+": ]"+myText); //What getTask returns
	}
}
