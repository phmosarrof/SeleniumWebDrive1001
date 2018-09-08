package seleniumWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumPractiec {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.ie.driver", "C:/Users/Mosarrof Hossain/Utilities/MicrosoftWebDriver.exe");
        //WebDriver driver = new InternetExplorerDriver();
		WebDriver driver = new InternetExplorerDriver();
         driver.get("http://www.store.demoqa.com");
         // driver.findElement(By.id("account")).click();
         //driver.findElement(By.xpath("//*[@class='account_icon']")).click();
         driver.findElement(By.xpath("//*[@id=\'account\']/a")).click();
         Thread.sleep(2000);
         driver.findElement(By.cssSelector("#log")).sendKeys("Mosarrof");
         Thread.sleep(2000);
         driver.findElement(By.cssSelector("#pwd")).sendKeys("Hossain");
         Thread.sleep(2000);

         driver.findElement(By.xpath("//*[@id=\'rememberme\']")).click();
         Thread.sleep(2000);

         driver.findElement(By.xpath("//*[@id=\'login\']")).click();
         driver.get("//*[@id=\"ajax_loginform\"]/p[1]");
         Thread.sleep(2000);

         driver.close();
         
	}

}
