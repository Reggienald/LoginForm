package Model;

public class Model {
	
	public static boolean control(String uname, String pword) {
		if((uname.equals("Redon") && pword.equals("Redon")) || (uname.equals("Shaqiri") && pword.equals("Shaqiri"))) {
			return true;
		}else {
			return false;
		}
	}

}
