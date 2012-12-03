public class UserImpl implements User {
	
	private final String name;
	private Integer ID;
	private Library currentLibrary;
	
	public UserImpl(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getID() {
		return this.currentLibrary.getID(this.name);
	}
	
	public void register(Library newLibrary) {
		this.currentLibrary = newLibrary;
		this.currentLibrary.addUser(this);
		this.ID = this.currentLibrary.getID(this);
	}
	
	public String getLibrary() {
		return this.currentLibrary.getName();
	}
}
