package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class InicialPage {
	
	public WebDriver driver; 
	
	
	String womenBotao = "//*[@id=\"block_top_menu\"]/ul/li[1]/a";
	String dressesBotao = "//*[@id=\"block_top_menu\"]/ul/li[2]/a";
	String tshirtsBotao = "//*[@id=\"block_top_menu\"]/ul/li[3]/a";
	
	
	
	public InicialPage(WebDriver driver) {
	   this.driver = driver;
	 }
	  
	 public WebElement womenBotao() {
		return driver.findElement(By.xpath(womenBotao));	
	 }
	 
	 public WebElement dressesBotao() {
		return driver.findElement(By.xpath(dressesBotao));	
	 }
	 
	 public WebElement tshirtsBotao() {
		return driver.findElement(By.xpath(tshirtsBotao));	
	 }
}
