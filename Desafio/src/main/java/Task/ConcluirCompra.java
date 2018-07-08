package Task;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObject.AddressPage;
import PageObject.PaymentPage;
import PageObject.ShippingPage;
import PontoDeVerificacao.ValidarCompraFinalizadaComSucesso;
import PontoDeVerificacao.ValidarEndereco;
import PontoDeVerificacao.ValidarValorTotalDaCompra;
import Utilitarios.Metodos;
import Utilitarios.ObterRelatorio;

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
		try {
			metodos.clickElement(addressPage.proceedToCheckout());
			ObterRelatorio.log(Status.PASS, "Botão proceedToCheckout foi clicado.");
		}catch(Exception e) {
			ObterRelatorio.log(Status.FAIL, "Erro ao tentar clicar no botão." + e);
			metodos.getDriver().quit();
		}	
	}
	
	public void concordaComTermosDeServico() {
		try {
			metodos.clickElement(shippingPage.termosDeServicoClick());
			ObterRelatorio.log(Status.PASS, "Selecionado concordar com os termos.");
		}catch(Exception e) {
			ObterRelatorio.log(Status.FAIL, "Erro ao selecionar concordar com os termos." + e);
			metodos.getDriver().quit();
		}		
	}
	
	public void clicarProceedToCheckoutShippingPage() {
		try {
			metodos.clickElement(shippingPage.proceedToCheckout());
			ObterRelatorio.log(Status.PASS, "Botão proceedToCheckout foi clicado.");
		}catch(Exception e) {
			ObterRelatorio.log(Status.FAIL, "Erro ao tentar clicar no botão." + e);
			metodos.getDriver().quit();
		}
	}
	
	public void pagarComTranseferenciaBancaria() {
		try {
			metodos.clickElement(paymentPage.transferenciaBancaria());
			ObterRelatorio.log(Status.PASS, "botão pagar com tranferência bancária clicado.");
		}catch(Exception e) {
			ObterRelatorio.log(Status.FAIL, "Erro ao tentar clicar no botão." + e);
			metodos.getDriver().quit();
		}	
	}
	
	public void clicarIConfirmMyOrder() {
		try {
			metodos.clickElement(paymentPage.iConfirmMyOrderBotao());
			ObterRelatorio.log(Status.PASS, "botão (I Confirm my order) foi clicado.");
		}catch(Exception e) {
			ObterRelatorio.log(Status.FAIL, "Erro ao tentar clicar no botão." + e);
			metodos.getDriver().quit();
		}
		
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
