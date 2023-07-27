package MyProject_UIDAI_AadharCard;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Key_Board_TC001 {

	
		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Geiko Drivers\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
			Robot r = new Robot ();
//			r.keyPress(  KeyEvent.VK_TAB	);
//			r.keyRelease( KeyEvent.VK_TAB);
//			Thread.sleep(3000);
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);
//			Thread.sleep(3000);
			driver.findElement(By.name("txtUserName")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
			driver.quit();

	}

}
