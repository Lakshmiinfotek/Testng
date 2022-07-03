package demo_package;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assert_googlepage_title {
  @Test
  public void assertgoogletitle() {
 WebDriver driver ;
		
	 	   System.setProperty("Webdriver.chrome.driver","c:\\programfiles.chromedriver.exe.");
	   	// creating a driver and give a path
	 	  driver=new ChromeDriver();
	 			  
	 	 
	   	driver.get("https://google.com");//get the google
	    String expectedTitle ="Google";
	    String actualTitle = driver.getTitle();//string actual and exped values get it
	    
	    assertEquals(actualTitle,expectedTitle);
	}


		

	   	

  }
