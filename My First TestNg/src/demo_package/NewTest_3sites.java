package demo_package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest_3sites {
  @Test
  public void openingamazonwebsite() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","c:\\program files\\chromedriver.exe"); // giving a path to the webdriver
	  ChromeDriver driver = new ChromeDriver();//creating a new driver with help of chromedriver
	  driver.get("http://www.amazon.com");
	   System.out.println("opening amazon website in chromebrowser");
	   Thread.sleep(1000);
	   driver.close();
  }
	   
	

@Test
public void openingitlearnwebsite() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","c:\\program files\\chromedriver.exe"); // giving a path to the webdriver
	  ChromeDriver driver = new ChromeDriver();//creating a new driver with help of chromedriver
	  driver.get("https://www.itlearn360.com/");
	   System.out.println("opening itlearn website in chromebrowser");
	   Thread.sleep(1000);
	   driver.close();

	
}

@Test
public void openingcnnwebsite() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","c:\\program files\\chromedriver.exe"); // giving a path to the webdriver
	  ChromeDriver driver = new ChromeDriver();//creating a new driver with help of chromedriver
	  driver.get("https://www.cnn.com/");
	   System.out.println("opening cnn website in chromebrowser");
	   Thread.sleep(1000);
	   driver.close();
}
	
}
