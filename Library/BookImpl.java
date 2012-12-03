public class BookImpl implements Book {
	private final String author;
	private final String title;
	
	public BookImpl(String author, String title) {
		this.author = author;
		this.title = title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getTitle() {
		return this.title;
	}
}
