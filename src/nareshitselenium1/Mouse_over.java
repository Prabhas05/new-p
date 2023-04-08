package nareshitselenium1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;



public class Mouse_over {
	public static void main (String args[]) throws Exception {
		System.setProperty("Webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement (By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(1000);
		driver.findElement(By.name("Submit")).click();
	    Thread.sleep(1000);
	    System.out.println("login completed");
	    //mouseover
	    Actions ac = new Actions(driver);
	    ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	    System.out.println("mouseover complte");
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Add Employee")).click();
	    System.out.println("clked on submenu");
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Logout"));
	    Thread.sleep(2000);
	    System.out.println("logout complted");
	    driver.close();
	}
	    
	    
	    
	    
		
	}
