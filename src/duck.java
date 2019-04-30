import javax.swing.JOptionPane;

public class duck {
	int numberOfFriends;
	String favoriteFood;
	
	duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
}


	
	void quack() {
		JOptionPane.showMessageDialog(null, "Duck quacked");
	}
	void waddle() {
		JOptionPane.showMessageDialog(null, "Duck waddled");
	}

}
