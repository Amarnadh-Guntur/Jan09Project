package simplejavaprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CRMloginverify {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:\\Sel4\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://classic.crmpro.com");
		
		driver.findElement(By.name("username")).sendKeys("batchautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("Test");
	
		driver.findElement(By.id("surname")).sendKeys("forever");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

	}

}
