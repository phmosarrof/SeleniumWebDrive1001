package seleniumWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1001 {
	
	

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mosarrof Hossain\\Utilities\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/phmosarrof/SeleniumWebDrive1001");
	

	}

}
