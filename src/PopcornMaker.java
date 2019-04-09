import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor do you want?");
		Popcorn p = new Popcorn(flavor);
	    Microwave m = new Microwave();
	    m.putInMicrowave(p);
	    String time = JOptionPane.showInputDialog("How long do you want to cook the popcorn?");
	    int timeNum = Integer.parseInt(time);
	    m.setTime(timeNum);
	    m.startMicrowave();
	}

}
