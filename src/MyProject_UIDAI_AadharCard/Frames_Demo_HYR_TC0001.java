package MyProject_UIDAI_AadharCard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames_Demo_HYR_TC0001 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Geiko Drivers\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
				Thread.sleep(3000);
				driver.findElement(By.id("name")).sendKeys("Arfath");
				Thread.sleep(3000);
				driver.switchTo().frame("frm1");
				Select st = new Select(driver.findElement(By.id("course")));
				st.selectByValue("java");
				Thread.sleep(3000);
				driver.switchTo().defaultContent();
				driver.findElement(By.id("name")).clear();
				Thread.sleep(3000);
				driver.findElement(By.id("name")).sendKeys("Hello");
				Thread.sleep(3000);
				driver.quit();
	}

}
