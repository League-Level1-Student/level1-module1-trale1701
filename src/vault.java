
public class vault {
	int code = 0;
	
	vault(int code){
		this.code = code;
	}
	public boolean tryCode(int answer){
		if (answer==code) {
			return true;
		}
		else {return false;}
	}
}
