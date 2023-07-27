package MyProject_UIDAI_AadharCard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC003_UIDAI_Mouse_Hover {

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
		WebElement ele = driver.findElement(By.linkText("Contact & Support"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		System.out.println("Contact and Support Page Opened");
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.linkText("About UIDAI"));
		act.moveToElement(ele1).perform();
		System.out.println("About UIDAI Page Opened");
		Thread.sleep(3000);
		WebElement ele2 = driver.findElement(By.linkText("Ecosystem"));
		act.moveToElement(ele2).perform();
		System.out.println("Ecosystem Page Opened");
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
	}

}
