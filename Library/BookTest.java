import org.junit.*;
import static org.junit.Assert.*;

public class BookTest {
	@Test
	public void testsGetAuthor() {
		Book book = new BookImpl("J.R.R. Tolkien","Lord of the Rings");
		assertEquals("J.R.R. Tolkien",book.getAuthor());
	}
	@Test
	public void testsGetTitle() {
		Book book = new BookImpl("J.R.R. Tolkien","Lord of the Rings");
		assertEquals("Lord of the Rings",book.getTitle());
	}
}
				
