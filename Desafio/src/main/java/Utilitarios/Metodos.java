package Utilitarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Metodos {
	
public WebDriver driver;
	
	public Metodos(WebDriver driver) {
		   this.driver = driver;
	}

	
	public Metodos visita(String url) {
		   driver.get(url);
		   return this;
	}
	
	public WebDriver getChromeDriver() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}
	
	public void maximize() {
		driver.manage().window().maximize();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	

	public void clickElement(WebElement ele) throws InterruptedException {
			ele.wait(1);
			if(ele.isDisplayed()) {
				ele.click();
			}
	}
	
	public void selecionarElemento(WebElement ele, String texto) {
		Select select = new Select(ele);
	
		if(ele.isDisplayed()) {
			select.selectByVisibleText(texto);
		}
	}
	
	public void inserirTexto(WebElement ele, String texto) {
		if(ele.isDisplayed()) {
			ele.clear();
			ele.sendKeys(texto);
		}
	}
	
	
	public void Wait() {
		
	}

}
