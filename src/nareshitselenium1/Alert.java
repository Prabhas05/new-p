package nareshitselenium1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class Alert {
	public static void main (String args[]) throws Exception
	{
	System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	
	}

}
