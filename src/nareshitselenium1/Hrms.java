package nareshitselenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Hrms {

	
		public static void main (String args[]) throws Exception {
			System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.navigate().to("http://183.82.103.245/nareshit/login.php");
			System.out.println("application opened");
			Thread.sleep(3000);
			if (driver.getTitle().equals ("OrangeHRM - New Level of HR Management"))
			{
			System.out.println("title matched");
		}
			else
		{
			System.out.println("Title  not matched");
			System.out.println(driver.getTitle());

		}
			driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
			Thread.sleep(3000);
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(3000);
			System.out.println("login completed");
			if(driver.getTitle().equals("Orange HRM"))
			{
				System.out.println("title matched ");
			}
			else
			{
				System.out.println("title not matched");
				System.out.println(driver.getTitle());
			}
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("logout completed");
		driver.close();
		
			
			
			
			
			
		}
}
		
