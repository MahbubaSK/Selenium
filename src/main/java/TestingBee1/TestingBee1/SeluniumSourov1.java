package TestingBee1.TestingBee1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeluniumSourov1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String actual = driver.getTitle();
		String expected = "Practice Page";
		Assert.assertEquals(actual,expected);
		System.out.println(driver.getTitle());	
		
		//driver.navigate();             //this method didn't give any time for loading the URL page

		driver.findElement(By.xpath("(//input[@name='radioButton'])[2]")).click();//index number follow
		boolean bb = driver.findElement(By.xpath("(//input[@name='radioButton'])[2]")).isSelected();
		Assert.assertTrue(bb);
		/*while (bb) {
			System.out.println("The button has been selected");
		}*/
		
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("South Korea");
		//css---input[id='autocomplete']    //
		WebElement s = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select select = new Select(s);
		//Thread.sleep(3000l);
		select.selectByVisibleText("Option2");
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Alert']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		//String text = driver.switchTo().alert().getText();
		//System.out.println("I am from alert:  "+ text);
		Thread.sleep(3000);
	    WebElement sd = driver.findElement(By.xpath("//*[text()='Mouse Hover']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", sd);

		Actions action = new Actions(driver);
		action.moveToElement(sd).perform();
		Thread.sleep(3000);
		WebElement sdd = driver.findElement(By.xpath("//*[contains(text(),'Reload')]"));
		Thread.sleep(4000);
		action.moveToElement(sdd).click().perform();  //for more function, we use perform method
		Thread.sleep(3000);
		WebElement sddd = driver.findElement(By.xpath("//a[text()='Contact info']"));
		action.moveToElement(sddd).perform();
		Thread.sleep(3000);
		driver.quit();
		driver.close();
		//Quit= close every associated window opened by the Selenium
		
	 
	
	
	
	}

}
