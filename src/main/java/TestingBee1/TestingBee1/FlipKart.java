package TestingBee1.TestingBee1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//input[@class='_3704LK']
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();//3704LK
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
       Thread.sleep(3000);
	 driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
	 driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone");
	//driver.findElement(By.xpath("input[@class='_3704LK']")).click();
	List<WebElement> totalist=driver.findElements(By.xpath("//div[@class='lrtPEn_17d0yo']"));// need to add more on xpath
	for(int i=0; i<totalist.size(); i++) {
		totalist.get(i).getText();
		System.out.println(totalist.get(i).getText());
		if (totalist.get(i).getText().equalsIgnoreCase("iphone 12 mini")) {
			totalist.get(i).click();
		
		
		
		}
		//driver.close();
		//driver.quit();
	}
	//Thread.sleep(200l);
	//driver.quit();
	
	}

}
