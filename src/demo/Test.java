package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement element = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
		element.sendKeys("Pham");
		driver.findElement(By.name("lastName")).sendKeys("Viet Hoang");
		driver.findElement(By.name("phone")).sendKeys("0968111111");
		driver.findElement(By.id("userName")).sendKeys("hoangk46b522@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("50 Đàm Văn Lễ");
		driver.findElement(By.name("city")).sendKeys("Đà Nẵng");
		driver.findElement(By.name("state")).sendKeys("State NAme");
		driver.findElement(By.name("postalCode")).sendKeys("550000");
		
		Select s = new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("VIETNAM");
		
//		driver.findElement(By.name("state")).sendKeys("State NAme");
//		driver.findElement(By.name("state")).sendKeys("State NAme");
//		driver.findElement(By.name("state")).sendKeys("State NAme");
//		driver.findElement(By.name("state")).sendKeys("State NAme");


		
		
	}

}
