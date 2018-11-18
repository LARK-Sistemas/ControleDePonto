package testeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8081/primefaces/justificativaAbono.xhtml");
        driver.manage().window().maximize();
        driver.findElement(By.id("usuario")).sendKeys("admin");
        driver.findElement(By.id("senha")).sendKeys("123456");
        driver.findElement(By.id("btnEntrar")).click();
        try {
        	Thread.sleep(10000);
        }catch (InterruptedException e) {
			e.printStackTrace();
		}
        //tring at = driver.getTitle();
        //String et = "gmail";
        driver.close();
	}
}
