package TestingBee1.TestingBee1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		Thread.sleep(3000l);
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text]")).click();
		//Thread.sleep(3000l);
	//driver.findElement(By.xpath("input[@class='span[text()='HTML, CSS']']")).click();
	//driver.findElement(By.xpath(button[contains(@class,'multiselect'))).click();
	//button[contains(@class,'multiselect')
	//note //ul[contains(@class,'multiselect')]//li//a//label
	}

}
