public interface User {
	
	/**
	* Returns the name of the user.
	* @return user's name.
	*/
	String getName();
	
	/**
	* Returns the ID of the user.
	* @return user's ID.
	*/
	int getID();
	
	/**
	* Registers a person at a library.
	* @param newLibrary the new Library to register with.
	*/
	void register(Library newLibrary);
	
	/**
	* Returns the name of the library the user is
	* currently registered with.
	* @return user's current library name
	*/
	String getLibrary();
	
	User getNext();
	void setNext(User nextUser);
	
}
