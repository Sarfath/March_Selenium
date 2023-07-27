package MyProject_UIDAI_AadharCard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC002_Mouse_Hover {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Geiko Drivers\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://uidai.gov.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/center/div/div[3]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/span")).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.className("menu-title"));
		Actions act = new Actions (driver);
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Book an Appointment")).click();
		Thread.sleep(3000);
		//driver.quit();
		
		
		
	}

}
