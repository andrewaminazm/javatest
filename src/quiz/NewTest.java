package quiz;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	String driverPath = "C:\\Users\\TRUFLAEGY51\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe";
    public WebDriver driver ;
  @Test
  public void f() throws Exception {
	  VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
	
      //identify email
     driver.findElement(By.name("identifier"))
      .sendKeys("abdtest492@gmail.com");
    driver
      .findElement(By.className("VfPpkd-LgbsSe"))
      .click();
      //identify password
    
      driver
      .findElement(By.name("password"))
     .sendKeys("01211782855");
      driver
      .findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"))
      .click();
      driver.navigate().to("https://www.google.com/");  
      
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[2]/a")).click();
    Thread.sleep(7000);
 
    //Thread.sleep(7000);
   driver.findElement(By.id("identifierId"))
   .sendKeys("abdtest492@gmail.com");
   driver.findElement(By.className("VfPpkd-LgbsSe"))
  .click();
   driver.findElement(By.name("password"))
   .sendKeys("01211782855");
  driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"))
  .click();
  Thread.sleep(7000);
  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/a")).click();
  Thread.sleep(7000);
    driver.findElement(By.xpath("//*[@id=\":4c\"]/div/div")).click();
    driver.findElement(By.xpath("/html/body/div[23]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[1]/table/tbody/tr[1]/td[2]/div/div/textarea")).click();
    driver.findElement(By.xpath("/html/body/div[23]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[1]/table/tbody/tr[1]/td[2]/div/div/textarea")).sendKeys("abdtest492@gmail.com");
    driver.findElement(By.xpath("/html/body/div[23]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[1]/table/tbody/tr[1]/td[2]/div/div/textarea")).click();
    driver.findElement(By.xpath("/html/body/div[23]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div/div[1]/div[2]/div[1]/div/table/tbody/tr/td[2]/div[2]/div")).click();
    driver.findElement(By.xpath("/html/body/div[23]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div/div[1]/div[2]/div[1]/div/table/tbody/tr/td[2]/div[2]/div")).sendKeys("andrewamin");
    driver.findElement(By.xpath("/html/body/div[23]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[3]/input")).click();
    
    driver.findElement(By.xpath("/html/body/div[23]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[3]/input")).sendKeys("smaS");
    driver.findElement(By.xpath("/html/body/div[23]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[1]/div/div[2]/div[1]")).click();
    Thread.sleep(7000);
    driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[9]/div/div[1]/div[3]/div/table/tbody/tr[1]/td[3]/span")).click();
    driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[9]/div/div[1]/div[3]/div/table/tbody/tr[1]/td[4]/div[2]")).click();
    Thread.sleep(7000);
    driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div/table/tr/td[1]/div[2]/div[2]/div/div[3]/div/div/div/div/div/div[1]/div[2]/div[1]/table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/img")).click();
    Thread.sleep(7000);
    WebElement x = driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div/table/tr/td[1]/div[2]/div[2]/div/div[3]/div/div/div/div/div/div[1]/div[2]/div[2]/div/table/tbody/tr[4]/td[2]/span"));
    String ExpectedText = "smaS";
    Assert.assertEquals(ExpectedText, x.getText());
    System.out.println("text is a expected – Assert passed");
    VideoRecorder_utlity.stopRecord();//End point of video recording
    
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  String url = "https://accounts.google.com/signin";

      driver.get(url);
  }

  @AfterTest
  public void afterTest() {
  }

}
