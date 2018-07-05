package DBServer.Desafio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Metodos {
	
public WebDriver driver;
	
	public Metodos(WebDriver driver) {
		   this.driver = driver;
	}

	
	public Metodos visita(String url) {
		   driver.get(url);
		   return this;
	}
	

	public void clickElement(WebElement ele) throws InterruptedException {
			ele.wait(3);
			if(ele.isDisplayed()) {
				ele.click();
			}
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void Wait() {
		
	}

}
