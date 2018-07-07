package Task;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObject.AddressPage;
import PageObject.PaymentPage;
import PageObject.ShippingPage;
import Utilitarios.Metodos;

public class ConcluirCompra extends Metodos {

	public AddressPage addressPage;
	public PaymentPage paymentPage;
	public ShippingPage shippingPage;
	
	public ConcluirCompra(WebDriver driver) {
		super(driver);
		this.addressPage = new AddressPage(driver);
		this.paymentPage = new PaymentPage(driver);
		this.shippingPage = new ShippingPage(driver);
	}
	
	public void clicarProceedToCheckoutAdressPage() {
		clickElement(addressPage.proceedToCheckout());
	}
	
   //Como estou usando herança nesta classe, optei por usar override neste metodo, pois no metodo clickElement 
   //da classe Metodos ele executa com um if, com a condição de estar visivel.
   //Porem ao executar o teste, ele não clica nos termos de serviço, então sobrescrevi o metodo original, para
   //simplismente clicar direto.
	@Override
	public void clickElement(WebElement ele) {
		ele.click();
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
	
	public void concluiCompra(){
		clicarProceedToCheckoutAdressPage();
		concordaComTermosDeServico();
		clicarProceedToCheckoutShippingPage();
		pagarComTranseferenciaBancaria();
		clicarIConfirmMyOrder();
	}
}
