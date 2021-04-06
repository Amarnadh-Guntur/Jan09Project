package simplejavaprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handledropdowm {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:\\Sel4\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		if(pagetitle.equals("My Store")) {
			System.out.println("correct page");
		}
else {
	System.out.println("Incorrect page");
	
}
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email_create")).sendKeys("rtrfdah015@gmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		
		String logintitle=driver.getTitle();
		System.out.println(logintitle);
		if(logintitle.equals("Login - My Store")) {
			System.out.println("Correct Login page");
		}else {
			System.out.println("Incorrect login page");
		}
		
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.xpath("//input[@name='customer_firstname']")).sendKeys("Testcool");
		driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("one");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("New@1234");
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='days']")));
		select.selectByValue("19");
		
		Select select2 = new Select(driver.findElement(By.xpath("//select[@id='months']")));
		select2.selectByValue("10");
		
		Select select3 = new Select(driver.findElement(By.xpath("//select[@id='years']")));
		select3.selectByValue("1988");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rambo1");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("season");
		
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("12345 ave");
		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("georgia");
		
		Select select4 = new Select(driver.findElement(By.xpath("//select[@name='id_state']")));
		select4.selectByValue("4");
		
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("123444");
		
		Select select5 = new Select(driver.findElement(By.xpath("//select[@id='id_country']")));
		select5.selectByValue("21");
		
		driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("4544543343");
		
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("little");
		
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		
}
}