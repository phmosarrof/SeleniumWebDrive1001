package seleniumWeb;

//Class1: Consider this as ChromeDriver class

public class ChromeDriver implements WebDriver { // Class implements interface more than one.

	public void on() {							// unimplemented method of interface is implemted by the chromedrivr class 
		
		System.out.println("ChromeDriver On");

	}

	public void off() {
		System.out.println("ChromeDriver Off");

	}
}  

