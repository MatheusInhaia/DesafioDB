package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomenPage {

	public WebDriver driver;
	
	
	String blouse = "//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img";
	String addToCartBotao = "//*[@id=\"add_to_cart\"]/button"; 
	String proceedToCheckoutBotao = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a";
	
	
	public WomenPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement blouseBotao() {
		return driver.findElement(By.xpath(blouse));
	}
	
	public WebElement addToCartBotao() {
		return driver.findElement(By.xpath(addToCartBotao));
	}
	
	public WebElement proceedToCheckoutBotao() {
		return driver.findElement(By.xpath(proceedToCheckoutBotao));
	}
}
