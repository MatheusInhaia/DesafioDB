package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomenPage {

	public WebDriver driver;
	
	
	String blouse = "//*[@id=\"center_column\"]/ul/li[2]/div/div[1]";
	String addToCartBotao = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]"; 
	String meuCarrinhoBotao = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a";
	String coninuarNoShopping = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span";
	
	public WomenPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement blouseBotao() {
		return driver.findElement(By.xpath(blouse));
	}
	
	public WebElement addToCartBotao() {
		return driver.findElement(By.xpath(addToCartBotao));
	}
	
	public WebElement meuCarrinhoBotao() {
		return driver.findElement(By.xpath(meuCarrinhoBotao));
	}
	
	public WebElement continuarNoShopping() {
		return driver.findElement(By.xpath(coninuarNoShopping));
	}
}
