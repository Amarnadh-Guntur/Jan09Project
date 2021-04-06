package simplejavaprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingalertsonwebpage {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:\\Sel4\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//Set window maximize and delete cookies
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Set Page load timeouts and implicit waiit for the browser
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Pass the url to driver
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String txt = alert.getText();
		if(txt.equals("Please enter a valid user name")) {
			System.out.println("Correct text displayed");
		}else {
			System.out.println("Incorrect text displayed");
		}
		
		
	//alert.dismiss();
		
		alert.accept();
	
		driver.switchTo().defaultContent();
	
	driver.findElement(By.name("login")).sendKeys("Jan13");

	}

}
