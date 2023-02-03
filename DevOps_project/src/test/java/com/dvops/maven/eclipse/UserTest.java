package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {
	

	private User user;

	@BeforeEach
	void setUp() throws Exception {
		 user = new User ("User1", "pass","rjy@gmail","malay");
	}


	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetUsername() {
		assertEquals("User1", user.getUsername());
	}

	@Test
	void testSetUsername() {
		user.setUsername("User1");
		assertEquals("User1", user.getUsername());

	}

	@Test
	void testGetPassword() {
		assertEquals("pass", user.getPassword());
	}

	@Test
	void testSetPassword() {
		user.setPassword("pass");
		assertEquals("pass", user.getPassword());
	}

	@Test
	void testGetEmail() {
		
		assertEquals("rjy@gmail", user.getEmail());
	}

	
	@Test
	void testSetEmail() {
		user.setEmail("rjy@gmail");
		assertEquals("rjy@gmail", user.getEmail());
	}

	@Test
	void testGetRaces() {
		
		assertEquals("malay", user.getRaces());
	}

	@Test
	void testSetRaces() {
		user.setRaces("malay");
		assertEquals("malay", user.getRaces());
	}

}
