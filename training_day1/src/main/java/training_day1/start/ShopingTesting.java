package training_day1.start;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopingTesting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\OneDrive\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm/");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("naveen durga prasad");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Lopinti");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//input[@value='3']")).click();
		driver.findElement(By.xpath("//input[@value='4']")).click();
		driver.findElement(By.xpath("//input[@value='5']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("17/01/1996");
		driver.findElement(By.xpath("(//input[@name='profession'])[1]")).click();
		driver.findElement(By.xpath("(//input[@name='profession'])[2]")).click();
		driver.findElement(By.xpath("//input[@type='file']")).click();


	}

}
