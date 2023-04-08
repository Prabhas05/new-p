package nareshitselenium1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;




public class Myjava1 
{
	public static void main (String args[])  {
		System.setProperty("webdriver.chrome.driver", "c:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/shreya.mishra.1276487/");
		driver.close();
	}
	
	
}
