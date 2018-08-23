package seleniumWeb;

//Now Consider Runner Class:

//Here to change the implementation we just need to change the object
//Whether you need to access Mozilla or Chrome

public class Runner {

	public static void main(String args[]) {

		//WebDriver driver = new FireFoxDriver();//new FireFoxDriver();
		WebDriver driver = new ChromeDriver();//new FireFoxDriver();

		driver.on();
		driver.off();
		System.out.println("Voltage : "+WebDriver.voltage);
		System.out.println("The value of A : "+WebDriver.A);

	}
}