package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {

  private User user;

  @BeforeEach
  void setUp() {
    user = new User("usertester", "password", "usertester@email.com", "chinese");
  }

  @Test
  void testGetUsername() {
    assertEquals("usertester", user.getUsername());
  }

  @Test
  void testSetUsername() {
    user.setUsername("newUser");
    assertEquals("newUser", user.getUsername());
  }

  @Test
  void testGetPassword() {
    assertEquals("password", user.getPassword());
  }

  @Test
  void testSetPassword() {
    user.setPassword("newPassword");
    assertEquals("newPassword", user.getPassword());
  }

  @Test
  void testGetEmail() {
    assertEquals("usertester@email.com", user.getEmail());
  }

  @Test
  void testSetEmail() {
    user.setEmail("newEmail@email.com");
    assertEquals("newEmail@email.com", user.getEmail());
  }

  @Test
  void testGetRaces() {
    assertEquals("chinese", user.getRaces());
  }

  @Test
  void testSetRaces() {
    user.setRaces("newRace");
    assertEquals("newRace", user.getRaces());
  }
}