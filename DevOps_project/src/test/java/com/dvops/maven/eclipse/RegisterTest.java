package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegisterTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDoGetHttpServletRequestHttpServletResponse() {
		fail("Not yet implemented");
	}

	@Test
	void testDoPostHttpServletRequestHttpServletResponse() {
		User user = new User("ryan","pass","rjy@gmail.com","chinese");
		assertTrue(RegisterTest.register(user));
		
	}

	private static BooleanSupplier register(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
