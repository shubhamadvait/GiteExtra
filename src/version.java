import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class version {

	public static void main(String[] args) {
		
	     	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 	
	     //	WebDriver	driver =new  ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ACER\\Downloads\\geckodriver.exe");
	 	
	   WebDriver	driver =new  FirefoxDriver();
         
	     	driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.4.0");
	     	System.out.println(driver.getTitle());
	}

}
