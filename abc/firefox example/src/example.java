import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\kranthipc\\Downloads\\chromedriver.exe");
		
        WebDriver driver =new ChromeDriver();
       
        driver.get("http://qaclickacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());
        driver.close(); */
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\kranthipc\\Downloads\\IEdriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com");
		System.out.println(driver.getCurrentUrl());
		//driver.close();
	}

}
