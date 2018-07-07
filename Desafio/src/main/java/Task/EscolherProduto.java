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
	
	public void acessaPaginaWomen(){
		clickElement(inicialPage.womenBotao());
	}
	
	public void selecionaBlouse(){
		Actions action = new Actions(driver);
		action.moveToElement(womenPage.blouseBotao()).perform();	
	}
	
	public void adicionarAoCarrinho(){
		clickElement(womenPage.addToCartBotao());
	}
	
	public void meuCarrinhoBotao(){
		//Actions action = new Actions(driver);
		//action.moveToElement(womenPage.meuCarrinhoBotao()).perform();
		clickElement(womenPage.meuCarrinhoBotao());
	}
	
	public void proceedToCheckoutSummary(){
		clickElement(summaryPage.proceedToCheckoutBotao());
	}
	
	public void continuarNoShopping(){
		//Actions action = new Actions(driver);
		//action.moveToElement(womenPage.continuarNoShopping()).perform();
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(womenPage.continuarNoShopping()));
		clickElement(womenPage.continuarNoShopping());
	}
	
	public void escolhendoProduto() throws InterruptedException {
		acessaPaginaWomen();
		selecionaBlouse();
		adicionarAoCarrinho();
		continuarNoShopping();
		meuCarrinhoBotao();
		proceedToCheckoutSummary();
	}
}
