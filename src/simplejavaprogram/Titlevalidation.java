package simplejavaprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titlevalidation {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "F:\\Sel4\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://classic.crmpro.com");
		
		String pagetitle = driver.getTitle();
		
		System.out.println(pagetitle);
		
		if(pagetitle.equals("CRMPRO - CRM software for customer relationship management, sales, and support."))
		{
			System.out.println("Correct page displayed");
		}else
		{
			System.out.println("Incorrect page displayed");
		}
		
		/*System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.getPageSource());*/
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getClass());
		/*driver.getPageSource();
		driver.getCurrentUrl();*/
		driver.quit();

	}

}
