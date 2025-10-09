package demo3;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExplicitWait {

	
	public static void main(String args[]) {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(5));//declaration
		
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		
		WebElement newElement = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Samsung galaxy s6")));
		newElement.click();
		
		//This have to declared each time for wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		
	}
}
