package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {

	private WebDriver driver;
	
	
	String transferenciaBancaria = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p";
	String pagarComCheque = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p";
	String IConfirmMyOrderBotao = "//*[@id=\"cart_navigation\"]/button";
	String valorTotal = "//*[@id=\"total_price\"]";
	
	
	public PaymentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement transferenciaBancaria() {
		return driver.findElement(By.xpath(transferenciaBancaria));
	}
	
	public WebElement pagarComCheque() {
		return driver.findElement(By.xpath(pagarComCheque));
	}
	
	public WebElement iConfirmMyOrderBotao() {
		return driver.findElement(By.xpath(IConfirmMyOrderBotao));
	}
	
	public WebElement valorTotal() {
		return driver.findElement(By.xpath(valorTotal));
	}
}
