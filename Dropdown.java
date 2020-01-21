package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\TestAutomation\\chromedriver.exe");
		
		//String baseURL="http://output.jsbin.com/osebed/2";
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		Select fruits=new Select(driver.findElement(By.id("fruits")));
		
		//fruits.getAllSelectedOptions();
		
		fruits.selectByVisibleText("Apple");
		fruits.selectByVisibleText("Banana");
		System.out.println("Selected successfully");
		
		fruits.deselectAll();
		
		System.out.println("DESelected successfully");
		
	//	Error fixing-Inprogress
//		driver.get("http://demo.guru99.com/test/newtours/register.php");
//		
//		Select country=new Select(driver.findElement(By.name("country")));
//		
//		//country.selectByValue("ALBANIA");
//		country.selectByVisibleText("ANTARCTICA");
//		Thread.sleep(1000);
//		
//		System.out.println("Selected successfully");
//		
	
		
		
		
		
		
		
		driver.close();
		

	}

}
