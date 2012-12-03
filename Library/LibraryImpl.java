public class LibraryImpl implements Library {
	
	private final String NAME;
	private int maxBooksPerUser;
	private User first;
	
	public LibraryImpl(String name) {
		this.NAME = name;
	}
	
	public int getMaxBooksPerUser() {
		return maxBooksPerUser;
	}
	
	public void setMaxBooksPerUser(int newMax) {
		maxBooksPerUser = newMax;
	}
	
	public void addUser(User newUser) {
		if (first == null) {
			first = newUser;
			return;
		} else {
			User tmp = first;
			while (tmp.getNext()!=null) {
				tmp = tmp.getNext();
			}
			tmp.setNext(newUser);
		}
	}
	
	public int getID(String userName) {
		
					
		
	
	
