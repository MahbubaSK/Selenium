package TestingBee1.TestingBee1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelecttorHwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("mahbuba@practic.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Borno123");
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("CheepFundCompany");
	    
	    
	    //WebElement frame = driver.findElement(By.tagName("iframe"));
	    List <WebElement>totalFrame = driver.findElements(By.tagName("iframe"));
	   // totalFrame.size();
	   System.out.println("total frame "+totalFrame.size());
	   //driver.switchTo().frame("packt");
       WebElement scrollview= driver.findElement(By.xpath("//button[text()='checkout here']"));
       
     JavascriptExecutor jv=(JavascriptExecutor)driver;
     jv.executeScript("arguments[0].scrollview();",scrollview );
     driver.switchTo().frame("packt");
     
     WebElement elementTea = (WebElement)jv.executeScript("returndocument.querySelector('snacktime').sadowRoot.querySelector('#tea')" );
     String elementview = "arguments[0].setAttribute('value','Green Tea')";
     
     jv.executeScript(elementview, elementTea);
     WebElement elementlunch = (WebElement)jv.executeScript("returndocument.querySelector('snacktime').sadowRoot.querySelector('#tea')" );
     String elementlunch = "arguments[0].setAttribute('value','Green Tea')";
		//driver.findElement(By.xpath("//div[@class='uojl']")).sendKeys("I love tea");
		//driver.findElement(By.xpath("//input[@autocapitalize='off']")).sendKeys("I love tea");
	   // driver.findElement(By.xpath("//input[@id='pizza']")).sendKeys("Khichuri");
	    
	//JavascriptExecutor jv=(JavascriptExecutor)driver;
	//jv.executeScript("window.scriptTo(0,document.body.scrollHeight)" );
//note: have to set attribute // dom: document object p

	
	}

}
