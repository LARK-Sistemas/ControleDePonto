package testeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSelenium_Cadastro {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost:8081/controleponto/login.jsp");
	    driver.manage().window().maximize();	    
	    driver.findElement(By.name("j_username")).sendKeys("admin");
	    driver.findElement(By.name("j_password")).sendKeys("123456");
	    driver.findElement(By.id("btnEntrar") ).click();
	    
	    try {
	    	Thread.sleep(3000);
	    }catch (InterruptedException e) {
	    	e.printStackTrace();
	    }	    
	    driver.get("http://localhost:8081/controleponto/justificativaAbono.xhtml");
	    driver.findElement(By.name("formCorpo:j_idt13")).sendKeys("Justificativa");
	    driver.findElement(By.name("formCorpo:j_idt16")).sendKeys("No dia 03/12/2018 eu nao marquei ponto pois tive que ir ao médico");
	    driver.findElement(By.name("formCorpo:j_idt22")).sendKeys("12:12");
	    driver.findElement(By.name("formCorpo:j_idt25")).sendKeys("16:16");
	    driver.findElement(By.name("formCorpo:j_idt28")).sendKeys("03/12/2018");
	    driver.findElement(By.name("formCorpo:j_idt31")).sendKeys("03/12/2018");
	    try {
	    	Thread.sleep(3000);
	    }catch (InterruptedException e) {
	    	e.printStackTrace();
	    }
	    driver.findElement(By.id("formCorpo:btnAdicionar") ).click();
	    try {
	    	Thread.sleep(30000);
	    }catch (InterruptedException e) {
	    	e.printStackTrace();
	    }
	    //String at = driver.getTitle();
	    //String et = "Título aqui";
	    driver.close();
	}

}
