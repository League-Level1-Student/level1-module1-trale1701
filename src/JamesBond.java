import java.util.Random;

public class JamesBond {
	public int findCode(vault v) {
		for (int i = 0; i < 1000001; i++) {
			if (v.tryCode(i)==true) {return i;}
		}
		return -1;
	}
	public static void main(String[] args) {
		vault v = new vault(new Random().nextInt(1_000_001));
		JamesBond jb = new JamesBond();
		
		System.out.println(jb.findCode(v));
	}

}
