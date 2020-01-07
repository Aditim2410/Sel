package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\TestAutomation\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
		System.out.println("browser opened");
		driver.findElement(By.name("txtUsername")).sendKeys("opensourcecms");
		driver.findElement(By.name("txtPassword")).sendKeys("opensourcecms");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Logined Successfully");
		driver.quit();

	}

}
