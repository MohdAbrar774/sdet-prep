package demo01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumTest1 {
	
	
	public static void main(String args[]){
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	
			driver.get("https://www.google.com");
			
			String title = driver.getTitle();
			
			System.out.println("Page title is: "+ title);
			
			if(title.contains("Google")){
				
					System.out.println("Test Passed");
	}else {
		System.out.println("Test Failed");
	}
			
	
			driver.close();
	
	}
	
	
}
