package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

	public WebDriver driver; 
	
	String campoDeTextoEmail = "//*[@id=\"email_create\"]";
	String createAnAccountBotao = "//*[@id=\"SubmitCreate\"]";
	
	//YOUR PERSONAL INFORMATION
	String senhorBotao = "";
	String senhoraBotao = "";
	String campoDeTextoPrimeiroNome = "//*[@id=\"customer_firstname\"]";
	String campoDeTextoUltimoNome = "//*[@id=\"customer_lastname\"]";
	String CampoDeTextoSenha = "//*[@id=\"passwd\"]";
	String selecionaDiaAniversario = "//*[@id=\"days\"]";
	String selecionaMesAniversario = "//*[@id=\"months\"]";
	String selecionaAnoAniversario = "//*[@id=\"years\"]";
	
	//YOUR ADDRESS
	String campoDetextoPrimeiroNomeAddress = "//*[@id=\"firstname\"]";
	String campoDeTextoUltimoNomeAddress = "//*[@id=\"lastname\"]";
	String campoDeTextoEndereco = "//*[@id=\"address1\"]";
	String campoDeTextoCidade = "//*[@id=\"city\"]";
	String selecionaEstado = "//*[@id=\"id_state\"]";
	String selecionaPais = "//*[@id=\"id_country\"]";
	String campoDeTextoTelefone = "//*[@id=\"phone_mobile\"]";
	String campoDeTextoEnderecoAlternativo = "//*[@id=\"alias\"]";
	
	String registerBotao = "//*[@id=\"submitAccount\"]";
	
	
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement campoDeTextoEmail() {
		return driver.findElement(By.xpath(campoDeTextoEmail));
	}
	
	public WebElement createAnAccountBotao() {
		return driver.findElement(By.xpath(createAnAccountBotao));
	}
	
	
	//YOUR PERSONAL INFORMATION
	public WebElement senhorBotao() {
		return driver.findElement(By.xpath(senhorBotao));
	}
	
	public WebElement SenhoraBotao() {
		return driver.findElement(By.xpath(senhoraBotao));
	}
	
	public WebElement campoDeTextoPrimeiroNome() {
		return driver.findElement(By.xpath(campoDeTextoPrimeiroNome));
	}
	
	public WebElement campoDeTextoUltimoNome() {
		return driver.findElement(By.xpath(campoDeTextoUltimoNome));
	}
	
	public WebElement campoDeTextoSenha() {
		return driver.findElement(By.xpath(CampoDeTextoSenha));
	}
	
	public WebElement selecionaDiaAniversario() {
		return driver.findElement(By.xpath(selecionaDiaAniversario));
	}
	
	public WebElement selecionaMesAniversario() {
		return driver.findElement(By.xpath(selecionaMesAniversario));
	}
	
	public WebElement selecionaAnoAniversario() {
		return driver.findElement(By.xpath(selecionaAnoAniversario));
	}
	
	
	//YOUR ADDRESS
	public WebElement campoDeTextoPrimeiroNomeAddress() {
		return driver.findElement(By.xpath(campoDetextoPrimeiroNomeAddress));
	}
	
	public WebElement campoDeTextoUltimoNomeAddress() {
		return driver.findElement(By.xpath(campoDeTextoUltimoNomeAddress));
	}
	
	public WebElement campoDeTextoEndereco() {
		return driver.findElement(By.xpath(campoDeTextoEndereco));
	}
	
	public WebElement campoDeTextoCidade() {
		return driver.findElement(By.xpath(campoDeTextoCidade));
	}
	
	public WebElement selecionaEstado() {
		return driver.findElement(By.xpath(selecionaEstado));
	}
	
	public WebElement selecionaPais() {
		return driver.findElement(By.xpath(selecionaPais));
	}
	
	public WebElement campoDeTextoTelefone() {
		return driver.findElement(By.xpath(campoDeTextoTelefone));
	}
	
	public WebElement campoDeTextoEnderecoAlternativo() {
		return driver.findElement(By.xpath(campoDeTextoEnderecoAlternativo));
	}
	
	
	public WebElement registerBotao() {
		return driver.findElement(By.xpath(registerBotao));
	}
}
