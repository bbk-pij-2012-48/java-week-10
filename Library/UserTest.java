import org.junit.*;
import static org.junit.Assert.*;

public class UserTest {
	@Test
	public void testsGetName() {
		User user = new UserImpl("Dave");
		assertEquals("Dave",user.getName());
	}
	@Test
	public void testsRegisterLibrary() {
		User user = new UserImpl("Dave");
		Library lib = new Library();
		user.register(lib);
		assertEquals(13,user.getID());
	}
	@Test
	public void testsGetLibrary() {
		User user = new UserImpl("Dave");
		Library lib = new Library();
		user.register(lib);
		assertEquals("Library Name",user.getLibrary());
	}
}
