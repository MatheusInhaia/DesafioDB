package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class InicialPage {
	
	public WebDriver driver;
	public InicialPageXpath inicalPageXpath; 
	
	public InicialPage(WebDriver driver) {
	   this.driver = driver;
	   this.inicalPageXpath = new InicialPageXpath();
	 }
	  
	
	 public WebElement womenBotao() {
		return driver.findElement(By.xpath(inicalPageXpath.womenBotao));	
	 }
	 
	 public WebElement dressesBotao() {
		return driver.findElement(By.xpath(inicalPageXpath.dressesBotao));	
	 }
	 
	 public WebElement tshirtsBotao() {
		return driver.findElement(By.xpath(inicalPageXpath.tshirtsBotao));	
	 }
}
