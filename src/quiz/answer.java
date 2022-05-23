package quiz;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class answer {
	
	String driverPath = "C:\\Users\\TRUFLAEGY51\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe";
    public WebDriver driver ;
	
	//Creating WebDriver instance
			
	@BeforeTest
	@Parameters({"url","browser"})
	public void setup(String url,String browser) throws Exception{
	//Check if parameter passed from TestNG is 'firefox'
	if(browser.equalsIgnoreCase("firefox")){
	//create firefox instance
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\TRUFLAEGY51\\Downloads\\Compressed\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get(url);
	 
	
	}
	 
	//Check if parameter passed as 'chrome'
	else if(browser.equalsIgnoreCase("chrome")){
	//set path to chromedriver.exe
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\TRUFLAEGY51\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	
	 
	}
	
	else{
	//If no browser passed throw exception
	throw new Exception("Browser is not correct");
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	  @AfterTest
	  public void tearDown() {
	    driver.quit();
	  }
	  
	  @DataProvider(name="testdata")
	  public Object[][] TestDataFeed(){
	   
	  // Create object array with 2 rows and 2 column- first parameter is row and second is //column
	  Object [][] facebookdata=new Object[2][2];
	   
	  // Enter data to row 0 column 0
	  facebookdata[0][0]="username1@gmail";
	  // Enter data to row 0 column 1
	  facebookdata[0][1]="Password1";
	  // Enter data to row 1 column 0
	  facebookdata[1][0]="username2@gmail";
	  // Enter data to row 1 column 0
	  facebookdata[1][1]="Password2";
	  // return arrayobject to testscript
	  return facebookdata;
	  }	
	  @Test(dataProvider="testdata")
      public void search(String email,String name) throws Exception {
		  VideoRecorder_utlity.startRecord("amazonTestRecording");//Starting point of video recording
	
		  driver.manage().window().setSize(new Dimension(1066, 820));
		  driver.findElement(By.xpath("//*[@id=\"wt-cli-accept-all-btn\"]")).click();
		    driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div/a[1]/button/span")).click();
		    driver.findElement(By.xpath("//*[@id=\"cf-1\"]")).click();
		    driver.findElement(By.xpath("//*[@id=\"cf-1\"]")).sendKeys(name);
		    driver.findElement(By.xpath("//*[@id=\"cf-2\"]")).click();
		    driver.findElement(By.xpath("//*[@id=\"cf-2\"]")).sendKeys(email);
		   
		    driver.findElement(By.cssSelector(".has-spinner")).click();
		driver.findElement(By.xpath("//*[@id=\"fancybox-close\"]")).click();
		    
		    
          
     }
	 
	
        
      

}
