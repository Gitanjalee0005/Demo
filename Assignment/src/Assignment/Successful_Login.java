package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Successful_Login {

@Test

public void test() {
	
	// Open the Browser
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	// Navigate to url
	driver.get("https://app.germanyiscalling.com/common/login/");
	
	// Enter Credential on Email text field
	driver.findElement(By.id("username")).sendKeys("abc12345@gmail.com");
	
	// Enter Credential on Password text field
	driver.findElement(By.id("password")).sendKeys("abc@12345");
	
	// Click on Login Button
	driver.findElement(By.xpath("//button[text()='Log In']")).click();
	
	// Validation of Login Successful

	if(driver.getCurrentUrl().contains("cv/upload/"))
	{
		System.out.println("Login Successfull");
	}else
		System.out.println("Login failed");
	
	// Close the browser
	driver.close();
	
	
}
	
}


