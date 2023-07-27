package MyProject_UIDAI_AadharCard;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC003_DROPDOWN_KEYBOARDACTICITIES {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Geiko Drivers\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		//driver.findElement(By.name("txtUserName")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(3000);
		driver.findElement(By.name("clear")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys("Admin");
		//driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		//Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.linkText("Admin"));
		Actions at = new Actions(driver);
		at.moveToElement(ele).perform();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.linkText("Data Import/Export"));
		at.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Export")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		Select st = new Select(driver.findElement(By.name("cmbExportType")));
		st.selectByValue("MilleniumPayrollExport");
		Thread.sleep(3000);
		driver.findElement(By.id("btnExport")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
		
		
		
		
	}

}
