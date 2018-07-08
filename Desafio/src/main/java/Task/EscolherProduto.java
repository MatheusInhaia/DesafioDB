package Task;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.Status;

import PageObject.InicialPage;
import PageObject.SummaryPage;
import PageObject.WomenPage;
import PontoDeVerificacao.ValidarProdutoAdicionadoAoCarrinho;
import PontoDeVerificacao.ValidarValorTotalDaCompra;
import Utilitarios.Metodos;
import Utilitarios.ObterRelatorio;

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
		try {
			metodos.clickElement(inicialPage.womenBotao());
			ObterRelatorio.log(Status.PASS, "Página women acessada.");
		}catch(Exception e) {
			ObterRelatorio.log(Status.FAIL, "Erro ao tentar acessar a página women" + e);
		}
	}
	
	public void selecionaBlouse(){
		Actions action = new Actions(driver);
		action.moveToElement(womenPage.blouseBotao()).perform();	
	}
	
	public void adicionarAoCarrinho(){
		try {
			metodos.clickElement(womenPage.addToCartBotao());
			ObterRelatorio.log(Status.PASS, "Produto adicionado ao carrinho.");
		}catch(Exception e) {
			ObterRelatorio.log(Status.FAIL, "Erro ao tentar adicionar o produto." + e);
		}	
	}
	
	public void meuCarrinhoBotao(){
		try {
			metodos.clickElement(womenPage.meuCarrinhoBotao());
			ObterRelatorio.log(Status.PASS, "Acessando meu carrinho.");
		}catch(Exception e) {
			ObterRelatorio.log(Status.FAIL, "não foi possível acessar o carrinho." + e);
		}		
	}
	
	public void proceedToCheckoutSummary(){
		try {
			metodos.clickElement(summaryPage.proceedToCheckoutBotao());
			ObterRelatorio.log(Status.PASS, "ProceedToCheckout");
		}catch(Exception e) {
			ObterRelatorio.log(Status.FAIL, "não foi possível clicar." + e);
		}		
	}
	
	public void continuarNoShopping(){
		try {
			metodos.clickElement(womenPage.continuarNoShopping());
			ObterRelatorio.log(Status.PASS, "Continuar no shopping.");
		}catch(Exception e) {
			ObterRelatorio.log(Status.FAIL, "não foi possível clicar." + e);
		}
		
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
