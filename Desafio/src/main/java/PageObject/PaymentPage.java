package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {

public WebDriver driver;
	
	
	String transferenciaBancaria = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p";
	String pagarComCheque = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p";
	String IConfirmMyOrderBotao = "//*[@id=\"cart_navigation\"]/button";
	
	public PaymentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement transferenciaBancaria() {
		return driver.findElement(By.xpath(transferenciaBancaria));
	}
	
	public WebElement pagarComCheque() {
		return driver.findElement(By.xpath(pagarComCheque));
	}
	
	public WebElement IConfirmMyOrderBotao() {
		return driver.findElement(By.xpath(IConfirmMyOrderBotao));
	}
}
