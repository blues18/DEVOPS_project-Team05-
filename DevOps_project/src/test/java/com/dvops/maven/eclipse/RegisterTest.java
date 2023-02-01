package com.dvops.maven.eclipse;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class RegisterTest {
	private UserCollection sc;
	private user s1;
	private user s2;
	private final int USER_COLLECTION_SIZE = 2;
	@BeforeEach
	void setUp() throws Exception {
		sc = new UserCollection();
		s1 = new user("ryan", "password","ryan@gmail.com", "chinese");
		s2 = new user("james", "password","james@gmail.com", "malay");
		sc.addUser(s1);
		sc.addUser(s2);
	}
	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
	void testDoPostHttpServletRequestHttpServletResponse() {
		List<user> testSc = sc.getUser();
		assertEquals(testSc.size(), USER_COLLECTION_SIZE);
		sc.addUser(s1);
		assertEquals(sc.getUser().size(), USER_COLLECTION_SIZE+1);
	}
}

