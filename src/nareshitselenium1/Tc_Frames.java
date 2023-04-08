package nareshitselenium1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class Tc_Frames {
	public static void main (String args[])throws Exception {
		
	//test steps
		System.setProperty("webdriver.gecko.driver", "c:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(4000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("login completed");
		Thread.sleep(2000);
		//enter into frame
		driver.switchTo().frame("rightMenu");
		//clk ob add btn
		driver.findElement(By.xpath("//input[@class='plainbtn'][@value='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("prabhas");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("rn");
		driver.findElement(By.className("savebutton")).click();
		System.out.println("emp added");
		Thread.sleep(2000);
		//exit frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout complted");
		
		driver.close();
		
		
		
	}

}
