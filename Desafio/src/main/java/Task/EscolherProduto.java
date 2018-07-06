package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

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
		Actions action = new Actions(driver);
		action.moveToElement(womenPage.blouseBotao()).perform();	
	}
	
	public void adicionarAoCarrinho() throws InterruptedException {
		clickElement(womenPage.addToCartBotao());
	}
	
	public void meuCarrinhoBotao() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(womenPage.meuCarrinhoBotao()).perform();
		clickElement(womenPage.meuCarrinhoBotao());
	}
	
	public void proceedToCheckoutSummary() throws InterruptedException {
		clickElement(summaryPage.proceedToCheckoutBotao());
	}
	
	public void continuarNoShopping() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(womenPage.continuarNoShopping()).perform();
		clickElement(womenPage.continuarNoShopping());
	}
	
	public void escolhendoProduto() throws InterruptedException {
		acessaPaginaWomen();
		selecionaBlouse();
		adicionarAoCarrinho();
		Thread.sleep(1000);
		continuarNoShopping();
		meuCarrinhoBotao();
		proceedToCheckoutSummary();
	}
}
