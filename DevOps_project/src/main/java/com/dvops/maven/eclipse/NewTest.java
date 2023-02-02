package com.dvops.maven.eclipse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
  WebDriver webDriver;

  @Test
  public void checkLogin() {
    webDriver.navigate().to("http://localhost:8090/DevOps_project/login.jsp");
    webDriver.findElement(By.name("userName")).sendKeys("tester");
    webDriver.findElement(By.name("passWord")).sendKeys("password");
    webDriver.findElement(By.name("submit")).click();
  }
  
  @Test
  public void checkItem() {
      webDriver.navigate().to("http://localhost:8090/DevOps_project/ProductServlet/listDisplay");
      WebElement card = webDriver.findElement(By.className("card"));
      Assert.assertTrue(card.isDisplayed());
  }
  
  @Test
  public void checkRegister() {
  	webDriver.navigate().to("http://localhost:8090/DevOps_project/register_page.jsp");
  	webDriver.findElement(By.name("userName")).sendKeys("testuser");
  	webDriver.findElement(By.name("passWord")).sendKeys("testpassword");
  	webDriver.findElement(By.name("email")).sendKeys("testuser@example.com");
  	webDriver.findElement(By.name("races")).sendKeys("Chinese");
  	webDriver.findElement(By.name("submit")).click();
  }
  
  @Test
  public void checkUser() {
      webDriver.navigate().to("http://localhost:8090/DevOps_project/UserServlet/dashboard");
      WebElement table = webDriver.findElement(By.className("table"));
      Assert.assertTrue(table.isDisplayed());
  }


@BeforeTest
public void beforeTest() {
	  //Setting system properties of ChromeDriver
	  //to amend directory path based on your local file path
	  String chromeDriverDir = "C:\\Program Files\\Google\\Chrome\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", chromeDriverDir);

	  //initialize ChromeDriver at the start of test
	  webDriver = new ChromeDriver();  
}

@AfterTest
public void afterTest() {
  webDriver.quit();
}

}