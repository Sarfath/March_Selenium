package MyProject_UIDAI_AadharCard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC001_Mouse_Hover {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Geiko Drivers\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("toarfath@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Rajab@098");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath
        ("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div/div[1]/div[1]/ul/li[2]/span/div/a/span/svg/path")).click();
		Thread.sleep(3000);	
		
		
		
		
	}

}
