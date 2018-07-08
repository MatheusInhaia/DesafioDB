package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressPage {
	
	private WebDriver driver;
	
	String proceedToCheckout = "//*[@id=\"center_column\"]/form/p/button";


	public AddressPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement proceedToCheckout() {
		return driver.findElement(By.xpath(proceedToCheckout));
	}
}
