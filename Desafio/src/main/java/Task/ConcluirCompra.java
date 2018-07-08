package Task;


import org.openqa.selenium.WebDriver;


import PageObject.AddressPage;
import PageObject.PaymentPage;
import PageObject.ShippingPage;
import PontoDeVerificacao.ValidarCompraFinalizadaComSucesso;
import PontoDeVerificacao.ValidarEndereco;
import PontoDeVerificacao.ValidarValorTotalDaCompra;
import Utilitarios.Metodos;

public class ConcluirCompra{

	private WebDriver driver;
	private Metodos metodos;
	private AddressPage addressPage;
	private PaymentPage paymentPage;
	private ShippingPage shippingPage;
	private ValidarEndereco validarEndereco;
	private ValidarValorTotalDaCompra validarValorTotalDaCompra;
	private ValidarCompraFinalizadaComSucesso validarCompraFinalizadaComSucesso;
	
	public ConcluirCompra(WebDriver driver) {
		this.driver = driver;
		this.metodos = new Metodos(driver);
		this.addressPage = new AddressPage(driver);
		this.paymentPage = new PaymentPage(driver);
		this.shippingPage = new ShippingPage(driver);
		this.validarEndereco = new ValidarEndereco(driver);
		this.validarValorTotalDaCompra = new ValidarValorTotalDaCompra(driver);
		this.validarCompraFinalizadaComSucesso = new ValidarCompraFinalizadaComSucesso(driver);
	}
	
	public void clicarProceedToCheckoutAdressPage() {
		metodos.clickElement(addressPage.proceedToCheckout());
	}
	
	public void concordaComTermosDeServico() {
		metodos.clickElement(shippingPage.termosDeServicoClick());	
	}
	
	public void clicarProceedToCheckoutShippingPage() {
		metodos.clickElement(shippingPage.proceedToCheckout());
	}
	
	public void pagarComTranseferenciaBancaria() {
		metodos.clickElement(paymentPage.transferenciaBancaria());
	}
	
	public void clicarIConfirmMyOrder() {
		metodos.clickElement(paymentPage.iConfirmMyOrderBotao());
	}
	
	public void concluiCompra(String endereco, String cidade, String estado, String pais) throws InterruptedException{
		validarEndereco.validandoEndereco(endereco, cidade, estado, pais);
		clicarProceedToCheckoutAdressPage();
		concordaComTermosDeServico();
		validarValorTotalDaCompra.pegarValorDoFrete();
		clicarProceedToCheckoutShippingPage();
		validarValorTotalDaCompra.validandoValorTotalDaCompra();
		pagarComTranseferenciaBancaria();
		clicarIConfirmMyOrder();
		validarCompraFinalizadaComSucesso.validandoCompraFinalizadaComSucesso();	
	}
}
