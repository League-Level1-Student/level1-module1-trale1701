import javax.swing.JOptionPane;

public class human {
	int age;
	String name;
	
	human(String name, int age) {
      	this.name = name;
      	this.age = age;
}


	
	void sayHi() {
		JOptionPane.showMessageDialog(null, "Wazaaa!!! My name is " + name + "." + " I'm " + age + " years old.");
	}
	void highFive() {
		JOptionPane.showMessageDialog(null, "Human high fived");
	}

}
