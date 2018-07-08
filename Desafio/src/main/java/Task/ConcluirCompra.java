package Task;


import org.openqa.selenium.WebDriver;


import PageObject.AddressPage;
import PageObject.PaymentPage;
import PageObject.ShippingPage;
import PontoDeVerificacao.ValidarEndereco;
import Utilitarios.Metodos;

public class ConcluirCompra extends Metodos {

	public AddressPage addressPage;
	public PaymentPage paymentPage;
	public ShippingPage shippingPage;
	public ValidarEndereco validarEndereco;
	
	public ConcluirCompra(WebDriver driver) {
		super(driver);
		this.addressPage = new AddressPage(driver);
		this.paymentPage = new PaymentPage(driver);
		this.shippingPage = new ShippingPage(driver);
		this.validarEndereco = new ValidarEndereco(driver);
	}
	
	public void clicarProceedToCheckoutAdressPage() {
		clickElement(addressPage.proceedToCheckout());
	}
	
	public void concordaComTermosDeServico() {
		clickElement(shippingPage.termosDeServicoClick());	
	}
	
	public void clicarProceedToCheckoutShippingPage() {
		clickElement(shippingPage.proceedToCheckout());
	}
	
	public void pagarComTranseferenciaBancaria() {
		clickElement(paymentPage.transferenciaBancaria());
	}
	
	public void clicarIConfirmMyOrder() {
		clickElement(paymentPage.IConfirmMyOrderBotao());
	}
	
	public void concluiCompra(String endereco, String cidade, String estado, String pais){
		validarEndereco.validandoEndereco(endereco, cidade, estado, pais);
		clicarProceedToCheckoutAdressPage();
		concordaComTermosDeServico();
		clicarProceedToCheckoutShippingPage();
		pagarComTranseferenciaBancaria();
		clicarIConfirmMyOrder();
	}
}
