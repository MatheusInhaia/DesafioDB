package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ShippingPage {

	private WebDriver driver;
	
	
	String termosDeServicoClick = "//*[@id=\"cgv\"]";
	String proceedToCheckout = "//*[@id=\"form\"]/p/button";
	String valorDoFrete = "//*[@id=\"form\"]/div/div[2]/div[1]/div/div/table/tbody/tr/td[4]/div";
	
	
	public ShippingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement termosDeServicoClick() {
		return driver.findElement(By.xpath(termosDeServicoClick));
	}
	
	public WebElement proceedToCheckout() {
		return driver.findElement(By.xpath(proceedToCheckout));
	}
	
	public WebElement valorDoFrete() {
		return driver.findElement(By.xpath(valorDoFrete));
	}
}
