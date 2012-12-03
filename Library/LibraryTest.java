import org.junit.*;
import static org.junit.Assert.*;

public class LibraryTest {
	@Before
	public void buildUp() {
		Library lib = new LibraryImpl("Edgware");
	}
	@Test
	public void testsGetName() {
		assertEquals("Edgware",lib.getName());
	}
	@Test
	public void testsMaxBooksPerUser() {
		lib.setMaxBooksPerUser(5);
		assertEquals(5,lib.getMaxBooksPerUser());
	}
}
		
