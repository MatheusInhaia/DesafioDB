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
	
	public void inserirPrimeiroNome(String nome) {
		inserirTexto(signIn.campoDeTextoPrimeiroNome(), nome);
	}
	
	public void inserirUltimoNome(String nome) {
		inserirTexto(signIn.campoDeTextoUltimoNome(), nome);
	}
	
	public void inserirSenha(String senha) {
		inserirTexto(signIn.campoDeTextoSenha(), senha);
	}
	
	public void selecionaDiaAniversario(String dia) {
		selecionarElemento( signIn.selecionaDiaAniversario(), dia);
	}
	
	public void selecionaMesAniversario(String mes) {
		selecionarElemento(signIn.selecionaMesAniversario(), mes);
	}
	
	public void selecionaAnoAniversario(String ano) {
		selecionarElemento(signIn.selecionaAnoAniversario(), ano);
	}
	
	public void preencherInformacoesPessoais(String titulo, String primeiroNome, String ultimoNome, String senha, String dia, String mes, String ano) throws InterruptedException {
		selecionaTitulo(titulo);
		inserirPrimeiroNome(primeiroNome);
		inserirUltimoNome(ultimoNome);
		inserirSenha(senha);
		selecionaDiaAniversario(dia);
		selecionaMesAniversario(mes);
		selecionaAnoAniversario(ano);
	}
	
	
	//YOUR ADDRESS
	public void inserirPrimeiroNomeAddress(String nome) {
		inserirTexto(signIn.campoDeTextoPrimeiroNomeAddress(), nome);
	}
	
	public void inserirUltimoNomeAddress(String nome) {
		inserirTexto(signIn.campoDeTextoUltimoNomeAddress(), nome);
	}
	
	public void inserirEndereco(String endereco) {
		inserirTexto(signIn.campoDeTextoEndereco(), endereco);
	}
	
	public void inserirCidade(String cidade) {
		inserirTexto(signIn.campoDeTextoCidade(), cidade);
	}
	
	public void selecionaEstado(String estado) {
		selecionarElemento(signIn.selecionaEstado(), estado);
	}
	
	public void inserirCep(String cep) {
		inserirTexto(signIn.campoDeTextoCep(), cep);
	}
	
	public void selecionarPais(String pais) {
		selecionarElemento(signIn.selecionaPais(), pais);
	}
	
	public void inserirTelefone(String telefone) {
		inserirTexto(signIn.campoDeTextoTelefone(), telefone);
	}
	
	public void inserirEnderecoAlternativo(String endereco) {
		inserirTexto( signIn.campoDeTextoEnderecoAlternativo(), endereco);
	}
	
	public void preencherEndereco(String primeiroNome, String ultimoNome, String endereco, String cidade, String estado, String cep, String pais, String telefone, String enderecoAlternativo) {
		inserirPrimeiroNomeAddress(primeiroNome);
		inserirUltimoNomeAddress(ultimoNome);
		inserirEndereco(endereco);
		inserirCidade(cidade);
		selecionaEstado(estado);
		inserirCep(cep);
		selecionarPais(pais);
		inserirTelefone(telefone);
		inserirEnderecoAlternativo(enderecoAlternativo);
	}
	
	
	
	public void register() throws InterruptedException {
		clickElement(signIn.registerBotao());
	}
	
}
