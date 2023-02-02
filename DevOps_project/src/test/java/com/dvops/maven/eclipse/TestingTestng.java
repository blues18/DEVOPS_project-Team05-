package com.dvops.maven.eclipse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingTestng {
  WebDriver webDriver;
  private NewTest newTest;

  @BeforeEach
  void setUp() {
    //Setting system properties of ChromeDriver
    //to amend directory path based on your local file path
    String chromeDriverDir = "C:\\Program Files\\Google\\Chrome\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", chromeDriverDir);

    //initialize ChromeDriver at the start of test
    webDriver = new ChromeDriver();  
    newTest = new NewTest();
    newTest.webDriver = webDriver;
  }

  @AfterEach
  void tearDown() {
    webDriver.quit();
  }

  @Test
  void testCheckLogin() {
    newTest.checkLogin();
    String actualTitle = webDriver.getTitle();
    String expectedTitle = "Login Successful";
    assertTrue(actualTitle.contains(expectedTitle));
  }

  @Test
  void testCheckItem() {
    newTest.checkItem();
    WebElement card = webDriver.findElement(By.className("card"));
    assertTrue(card.isDisplayed());
  }

  @Test
  void testCheckRegister() {
    newTest.checkRegister();
    String actualTitle = webDriver.getTitle();
    String expectedTitle = "Registration Successful";
    assertTrue(actualTitle.contains(expectedTitle));
  }

  @Test
  void testCheckUser() {
    newTest.checkUser();
    WebElement table = webDriver.findElement(By.className("table"));
    assertTrue(table.isDisplayed());
  }

}