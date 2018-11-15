package testeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TstLogin {
	public static void main(String[] args) throws InterruptedException{  
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:8081/primefaces/funcionario.xhtml");
	    driver.manage().window().maximize();	    
	    driver.findElement(By.name("j_username")).sendKeys("admin");
	    driver.findElement(By.name("j_password")).sendKeys("123456");
	    driver.findElement(By.id("btnEntrar") ).click();
	    
	    try {
	    	Thread.sleep(10000);
	    }catch (InterruptedException e) {
	    	e.printStackTrace();
	    }	    
	    //String at = driver.getTitle();
	    //String et = "Título aqui";
	    driver.close();	    
    }

}
