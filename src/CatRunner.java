
public class CatRunner {
	public static void main(String[] args) {
		Cat c = new Cat("c");
		c.meow();
		c.printName();
		for (int i = 0; i < 10; i++) {
			c.kill();
		}
		
	}

}
