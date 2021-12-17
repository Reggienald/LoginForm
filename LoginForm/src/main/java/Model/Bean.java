package Model;

public class Bean {
	
	private String name;
	private String password;
	
	
	public Bean(String name, String password) {
		if(Model.checkLoginDetails(name, password)) {
			this.name = name;
			this.password = password;
		}else {
			this.name = "unknown";
			this.password = "unknown";
		}
		
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	
	

}