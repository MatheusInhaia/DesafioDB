package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ShippingPage {

	public WebDriver driver;
	
	
	String termosDeServicoClick = "//*[@id=\"cgv\"]";
	String proceedToCheckout = "//*[@id=\"form\"]/p/button";
	
	
	public ShippingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement termosDeServicoClick() {
		return driver.findElement(By.xpath(termosDeServicoClick));
	}
	
	public WebElement proceedToCheckout() {
		return driver.findElement(By.xpath(proceedToCheckout));
	}
}
