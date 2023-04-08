package nareshitselenium1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class Rammapa_Temple {
	public static void main (String args [])throws Exception {
	System.setProperty("webdriver.gecko.driver", "C://Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://google.com");
	driver.findElement(By.name("q")).sendKeys("rammpappa temple");
	
	
	}

}
