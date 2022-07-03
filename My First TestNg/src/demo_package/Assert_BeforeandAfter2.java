package demo_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assert_BeforeandAfter2 {
	WebDriver driver;

 
	  @Test
	  public void Performinglogin() throws InterruptedException {
	   
	    driver.get("https://opensource-demo.orangehrmlive.com");// trying to open site
	    
	  	  
	    WebElement username= driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")); //trying to enter username by using xpath
	    WebElement password =driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));//trying to password by xpayhlocator to element password
	    WebElement submitbutton =  driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
		  //trying to locate submitbutton by xpath locator
		 

	    username.clear();//clear the old values or username
	    password.clear();//clear the old values or password
	    
	    username.sendKeys("Admin");//send our username to username element
	    password.sendKeys("admin123");//send our password to password element
	    
	    submitbutton.click();
	    Thread.sleep(1000);//sleep 2000 milli sec
	 

	  }


	  @BeforeTest
	     public void beforeTest() {
	  	// System.out.println("@Before test,set the driver and give the path and maximize window");
	         System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	         driver = new ChromeDriver();
	         //driver.manage().window().maximize();//trying to maximize the get window
	         
	  }

	  @AfterTest
	  public void afterTest() {
	  	 System.out.println("--@afterTest, closing the browser window");//we are passing the code for after testing.and close.
	  	
	  	//driver.close();//trying to close the window
	  	

  }
}
