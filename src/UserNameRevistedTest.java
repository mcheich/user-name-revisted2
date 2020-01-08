import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserNameRevistedTest {

	@Test
	void getUserNameTest() {
		assertEquals("bobby", UserNameRevisted.getUserName());
	}
	
//	@Test
//	void checkUserNameLenghtTooShort() {
//		assertEquals(true, UserNameRevisted.checkUserNameLength("bobb"));
//	}

}
