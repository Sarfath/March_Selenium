package MyProject_UIDAI_AadharCard;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC001_Alert_Method {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
		"C:\\Geiko Drivers\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(3000);
		
		//Alert Box//
		driver.findElement(By.id("alertBox")).click();
		Alert alt  = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(3000);
		alt.accept();
	    Thread.sleep(3000);
	    System.out.println(driver.findElement(By.id("output")).getText());
	    
	    
		//Confirm Box//
	    driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(3000);
		System.out.println(alt.getText());
		alt.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		
		//Prompt Box//
		driver.findElement(By.id("promptBox")).click();
		alt.sendKeys("Arfath");
		Thread.sleep(3000);
		System.out.println(alt.getText());
		alt.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.quit();
		

	}

}
