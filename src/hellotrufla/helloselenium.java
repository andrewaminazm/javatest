package hellotrufla;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TRUFLAEGY51\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
		//Creating WebDriver instance
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.get("https://www.amazon.in/");
		          
				driver.findElement(By.id("twotabsearchtextbox")).click();
			    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("wrist watch");
			    driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
