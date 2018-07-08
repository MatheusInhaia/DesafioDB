package Task;






import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;


import PageObject.InicialPage;
import PageObject.SummaryPage;
import PageObject.WomenPage;
import PontoDeVerificacao.ValidarProdutoAdicionadoAoCarrinho;
import Utilitarios.Metodos;

public class EscolherProduto extends Metodos {
	
	private InicialPage inicialPage;
	private WomenPage womenPage;
	private SummaryPage summaryPage;
	private ValidarProdutoAdicionadoAoCarrinho validarProdutoAdiconadoAoCarrinho;
	
	public EscolherProduto(WebDriver driver) {
		super(driver);
		this.inicialPage = new InicialPage(driver);
		this.womenPage = new WomenPage(driver);
		this.summaryPage = new SummaryPage(driver);
		this.validarProdutoAdiconadoAoCarrinho = new ValidarProdutoAdicionadoAoCarrinho(driver);
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
		clickElement(womenPage.meuCarrinhoBotao());
	}
	
	public void proceedToCheckoutSummary(){
		clickElement(summaryPage.proceedToCheckoutBotao());
	}
	
	public void continuarNoShopping(){
		clickElement(womenPage.continuarNoShopping());
	}
	
	public void escolhendoProduto(String quantidade, String nomeProduto) throws InterruptedException {
		acessaPaginaWomen();
		selecionaBlouse();
		adicionarAoCarrinho();
		continuarNoShopping();
		meuCarrinhoBotao();
		validarProdutoAdiconadoAoCarrinho.validandoProduto(quantidade, nomeProduto);
		proceedToCheckoutSummary();
	}
}
