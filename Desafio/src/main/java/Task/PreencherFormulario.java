package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObject.SignInPage;
import Utilitarios.Metodos;

public class PreencherFormulario extends Metodos {

	private SignInPage signIn;
	
	public PreencherFormulario(WebDriver driver) {
		super(driver);
		this.signIn = new SignInPage(driver);
	}
	
	public void criarConta(String email) {
		inserirTexto(signIn.campoDeTextoEmail(), email);
	}
	
	
	//YOUR PERSONAL INFORMATION
	public void selecionaTitulo(String titulo) throws InterruptedException {
		if(titulo == "senhor" || titulo == "Senhor" ) {
			clickElement(signIn.senhorBotao());
		}else {
			clickElement(signIn.SenhoraBotao());
		}
	}
	
	public void inserirPrimeiroNome(String nome, WebElement ele) {
		inserirTexto(ele, nome);
	}
	
	public void inserirUltimoNome(String nome, WebElement ele) {
		inserirTexto(ele, nome);
	}
	
	public void inserirSenha(String senha, WebElement ele) {
		inserirTexto(ele, senha);
	}
	
	public void selecionaDiaAniversario(String dia, WebElement ele) {
		selecionarElemento(ele, dia);
	}
	
	public void selecionaMesAniversario(String mes, WebElement ele) {
		selecionarElemento(ele, mes);
	}
	
	public void selecionaAnoAniversario(String ano, WebElement ele) {
		selecionarElemento(ele, ano);
	}
	
	public void preencherInformacoesPessoais(String titulo, String primeiroNome, String ultimoNome, String senha, String dia, String mes, String ano) throws InterruptedException {
		selecionaTitulo(titulo);
		inserirPrimeiroNome(primeiroNome, signIn.campoDeTextoPrimeiroNome());
		inserirUltimoNome(ultimoNome, signIn.campoDeTextoUltimoNome());
		inserirSenha(senha, signIn.campoDeTextoSenha());
		selecionaDiaAniversario(dia, signIn.selecionaDiaAniversario());
		selecionaMesAniversario(mes, signIn.selecionaMesAniversario());
		selecionaAnoAniversario(ano, signIn.selecionaAnoAniversario());
	}
	
	
	//YOUR ADDRESS
	public void inserirPrimeiroNomeAddress(String nome, WebElement ele) {
		inserirTexto(ele, nome);
	}
	
	public void inserirUltimoNomeAddress(String nome, WebElement ele) {
		inserirTexto(ele, nome);
	}
	
	public void inserirEndereco(String endereco, WebElement ele) {
		inserirTexto(ele, endereco);
	}
	
	public void inserirCidade(String cidade, WebElement ele) {
		inserirTexto(ele, cidade);
	}
	
	public void selecionaEstado(String estado, WebElement ele) {
		selecionarElemento(ele, estado);
	}
	
	public void inserirCep(String cep, WebElement ele) {
		inserirTexto(ele, cep);
	}
	
	public void selecionarPais(String pais, WebElement ele) {
		selecionarElemento(ele, pais);
	}
	
	public void inserirTelefone(String telefone, WebElement ele) {
		inserirTexto(ele, telefone);
	}
	
	public void inserirEnderecoAlternativo(String endereco, WebElement ele) {
		inserirTexto(ele, endereco);
	}
	
	public void preencherEndereco(String primeiroNome, String ultimoNome, String endereco, String cidade, String estado, String cep, String pais, String telefone, String enderecoAlternativo) {
		inserirPrimeiroNomeAddress(primeiroNome, signIn.campoDeTextoPrimeiroNomeAddress());
		inserirUltimoNomeAddress(ultimoNome, signIn.campoDeTextoUltimoNomeAddress());
		inserirEndereco(endereco, signIn.campoDeTextoEndereco());
		inserirCidade(cidade, signIn.campoDeTextoCidade());
		selecionaEstado(estado, signIn.selecionaEstado());
		inserirCep(cep, signIn.campoDeTextoCep());
		selecionarPais(pais, signIn.selecionaPais());
		inserirTelefone(telefone, signIn.campoDeTextoTelefone());
		inserirEnderecoAlternativo(enderecoAlternativo, signIn.campoDeTextoEnderecoAlternativo());
	}
	
	
	
	public void register() throws InterruptedException {
		clickElement(signIn.registerBotao());
	}
	
}
