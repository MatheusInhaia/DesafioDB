package Task;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;


import PageObject.InicialPage;
import PageObject.SummaryPage;
import PageObject.WomenPage;
import PontoDeVerificacao.ValidarProdutoAdicionadoAoCarrinho;
import PontoDeVerificacao.ValidarValorTotalDaCompra;
import Utilitarios.Metodos;

public class EscolherProduto{
	
	private WebDriver driver;
	private Metodos metodos;
	private InicialPage inicialPage;
	private WomenPage womenPage;
	private SummaryPage summaryPage;
	private ValidarProdutoAdicionadoAoCarrinho validarProdutoAdiconadoAoCarrinho;
	private ValidarValorTotalDaCompra validarValorTotalDaCompra;
	
	public EscolherProduto(WebDriver driver) {
		this.driver = driver;
		this.metodos = new Metodos(driver);
		this.inicialPage = new InicialPage(driver);
		this.womenPage = new WomenPage(driver);
		this.summaryPage = new SummaryPage(driver);
		this.validarProdutoAdiconadoAoCarrinho = new ValidarProdutoAdicionadoAoCarrinho(driver);
		this.validarValorTotalDaCompra = new ValidarValorTotalDaCompra(driver);
	}
	
	public void acessaPaginaWomen(){
		metodos.clickElement(inicialPage.womenBotao());
	}
	
	public void selecionaBlouse(){
		Actions action = new Actions(driver);
		action.moveToElement(womenPage.blouseBotao()).perform();	
	}
	
	public void adicionarAoCarrinho(){
		metodos.clickElement(womenPage.addToCartBotao());
	}
	
	public void meuCarrinhoBotao(){
		metodos.clickElement(womenPage.meuCarrinhoBotao());
	}
	
	public void proceedToCheckoutSummary(){
		metodos.clickElement(summaryPage.proceedToCheckoutBotao());
	}
	
	public void continuarNoShopping(){
		metodos.clickElement(womenPage.continuarNoShopping());
	}
	
	public void escolhendoProduto(String quantidade, String nomeProduto) throws InterruptedException {
		acessaPaginaWomen();
		validarValorTotalDaCompra.pegarValorDaRoupa();
		selecionaBlouse();
		adicionarAoCarrinho();
		continuarNoShopping();
		meuCarrinhoBotao();
		validarProdutoAdiconadoAoCarrinho.validandoProduto(quantidade, nomeProduto);
		proceedToCheckoutSummary();
	}
}
