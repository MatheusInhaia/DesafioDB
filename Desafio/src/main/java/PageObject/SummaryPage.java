package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SummaryPage {
	
	private WebDriver driver; 
	
	String proceedToCheckoutBotao = "//*[@id=\"center_column\"]/p[2]/a[1]";
	

	public SummaryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement proceedToCheckoutBotao() {
		return driver.findElement(By.xpath(proceedToCheckoutBotao));
	}
}
