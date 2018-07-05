package Task;

import org.openqa.selenium.WebDriver;

import PageObject.InicialPage;
import PageObject.SummaryPage;
import PageObject.WomenPage;
import Utilitarios.Metodos;

public class EscolherProduto extends Metodos {
	
	private InicialPage inicialPage;
	private WomenPage womenPage;
	private SummaryPage summaryPage;
	
	public EscolherProduto(WebDriver driver) {
		super(driver);
		this.inicialPage = new InicialPage(driver);
		this.womenPage = new WomenPage(driver);
		this.summaryPage = new SummaryPage(driver);
	}
	
	public void acessaPaginaWomen() throws InterruptedException {
		clickElement(inicialPage.womenBotao());
	}
	
	public void selecionaBlouse() throws InterruptedException {
		clickElement(womenPage.blouseBotao());
	}
	
	public void adicionarAoCarrinho() throws InterruptedException {
		clickElement(womenPage.addToCartBotao());
	}
	
	public void proceedToCheckout() throws InterruptedException {
		clickElement(womenPage.proceedToCheckoutBotao());
	}
	
	public void proceedToCheckoutSummary() throws InterruptedException {
		clickElement(summaryPage.proceedToCheckoutBotao());
	}
	
	public void escolhendoProduto() throws InterruptedException {
		acessaPaginaWomen();
		selecionaBlouse();
		adicionarAoCarrinho();
		proceedToCheckout();
		proceedToCheckoutSummary();
	}
}
