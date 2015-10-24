package singleton;

public class Company {
	
	private static Company instance = new Company();  //유일한 객체. 외부에서 접근하면 안되니까 private, 유일하니까 private  
	
	private Company(){} //이렇게 하면 외부에서 new할 수 없다. 
	
	public static Company getInstance() { //company가 없어도(new 하지 않아도) 갖다 써야되기 때문에 static 붙여준다.
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
