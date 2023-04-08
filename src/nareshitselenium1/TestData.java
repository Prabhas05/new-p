package nareshitselenium1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
public class TestData {
//test data
	// Dt  var VV
	static String url = "http://183.82.103.245/nareshit/login.php";
	static String username= "nareshit";
	static String password="nareshit";
	static String title1 = "OrangeHRM - New Level of HR Management";
	static String title2 = "Orange HRM";
	public static void main (String args[]) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to(url);
		Thread.sleep(3000);
		System.out.println("Application Opened");
		//Verify Title
		//Actual Result     compare  Exp.Reslt
		if(driver.getTitle().equals(title1)) {
		System.out.println("Title matched");
		}
		else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
		}
		/* //   TestData : HardCoded
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit"); */

		//using var
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);

		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		//Verify Title
		if(driver.getTitle().equals(title2)) {
		System.out.println("Title matched");
		}
		else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
		}
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		System.out.println("Logout completed");
		driver.close();
		}
		
	}
	

