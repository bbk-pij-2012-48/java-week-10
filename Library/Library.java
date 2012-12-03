public interface Library {
	
	/**
	* Returns the name of the library
	* @return library name
	*/
	String getName();

	/** 
	* Returns the ID of the user
	* @param userName user to be returned
	* @return user's ID
	*/	
	int getID(String userName);
	
	/**
	* Returns the max number of books that 
	* can be borrowed by one user
	* @return max number of books
	*/
	int getMaxBooksPerUser();
	
	/**
	* Sets the max number of books to
	* a given number.
	* @param newMax new maximum number of books
	*/
	void setMaxBooksPerUser(int newMax);
	
	User getFirst();
	void setFirst(User firstUser);
	void addUser(User newUser);
}
	
