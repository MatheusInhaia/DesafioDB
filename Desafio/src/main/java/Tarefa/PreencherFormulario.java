package Tarefa;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObject.SignInPage;
import Utilitarios.Metodos;
import Utilitarios.ObterRelatorio;

public class PreencherFormulario{

	private WebDriver driver;
	private Metodos metodos;
	private SignInPage signIn;
	
	public PreencherFormulario(WebDriver driver) {
		this.driver = driver;
		this.metodos = new Metodos(driver);
		this.signIn = new SignInPage(driver);
	}
	
	public void criarConta(String email){
		try {
		metodos.inserirTexto(signIn.campoDeTextoEmail(), email);
		metodos.clickElement(signIn.createAnAccountBotao());
		ObterRelatorio.log(Status.PASS, "Criando uma conta.");
		}catch(Exception e) {
			ObterRelatorio.log(Status.FAIL, "Não foi possível criar a conta." + e);
			metodos.getDriver().quit();
		}
	}
	
	
	//YOUR PERSONAL INFORMATION
	public void inserirPrimeiroNome(String nome){
		try {
			metodos.inserirTexto(signIn.campoDeTextoPrimeiroNome(), nome);
			ObterRelatorio.log(Status.PASS, "Primeiro nome foi inserido.");
			}catch(Exception e) {
				ObterRelatorio.log(Status.FAIL, "Não foi possível inserir o primeiro nome." + e);
				metodos.getDriver().quit();
			}
	}
	
	
	public void inserirUltimoNome(String nome) {
		try {
			metodos.inserirTexto(signIn.campoDeTextoUltimoNome(), nome);
			ObterRelatorio.log(Status.PASS, "Ultimo nome foi inserido.");
			}catch(Exception e) {
				ObterRelatorio.log(Status.FAIL, "Não foi possível inserir o ultimo nome." + e);
				metodos.getDriver().quit();
			}	
	}
	
	public void inserirSenha(String senha) {
		try {
			metodos.inserirTexto(signIn.campoDeTextoSenha(), senha);
			ObterRelatorio.log(Status.PASS, "Senha foi inserida.");
			}catch(Exception e) {
				ObterRelatorio.log(Status.FAIL, "Não foi possível inserir a senha." + e);
				metodos.getDriver().quit();
			}	
	}
	
	public void preencherInformacoesPessoais(String primeiroNome, String ultimoNome, String senha) throws InterruptedException {
		Thread.sleep(3000);
		inserirPrimeiroNome(primeiroNome);
		inserirUltimoNome(ultimoNome);
		inserirSenha(senha);
	}
	
	
	//YOUR ADDRESS
	public void inserirEndereco(String endereco) {
		try {
			metodos.inserirTexto(signIn.campoDeTextoEndereco(), endereco);
			ObterRelatorio.log(Status.PASS, "Endereço foi inserido.");
			}catch(Exception e) {
				ObterRelatorio.log(Status.FAIL, "Não foi possível inserir o endereço." + e);
				metodos.getDriver().quit();
			}	
	}
	
	public void inserirCidade(String cidade) {
		try {
			metodos.inserirTexto(signIn.campoDeTextoCidade(), cidade);
			ObterRelatorio.log(Status.PASS, "Cidade foi inserida.");
			}catch(Exception e) {
				ObterRelatorio.log(Status.FAIL, "Não foi possível inserir a cidade." + e);
				metodos.getDriver().quit();
			}	
	}
	
	public void selecionaEstado(String estado){
		try {
			metodos.selecionarElementoByText(signIn.selecionaEstado(), estado);
			ObterRelatorio.log(Status.PASS, "estado foi selecionado.");
			}catch(Exception e) {
				ObterRelatorio.log(Status.FAIL, "Não foi possível selecionar o estado." + e);
				metodos.getDriver().quit();
			}
	}
	
	public void inserirCep(String cep) {
		try {
			metodos.inserirTexto(signIn.campoDeTextoCep(), cep);
			ObterRelatorio.log(Status.PASS, "Cep foi inserido.");
			}catch(Exception e) {
				ObterRelatorio.log(Status.FAIL, "Não foi possível inserir o cep." + e);
				metodos.getDriver().quit();
			}	
	}
	
	public void selecionarPais(String pais) {
		try {
			metodos.selecionarElementoByText(signIn.selecionaPais(), pais);
			ObterRelatorio.log(Status.PASS, "País foi selecionado.");
			}catch(Exception e) {
				ObterRelatorio.log(Status.FAIL, "Não foi possível selecionar o país." + e);
				metodos.getDriver().quit();
			}
	}
	
	public void inserirTelefone(String telefone) {
		try {
			metodos.inserirTexto(signIn.campoDeTextoTelefone(), telefone);
			ObterRelatorio.log(Status.PASS, "Telefone foi inserido.");
			}catch(Exception e) {
				ObterRelatorio.log(Status.FAIL, "Não foi possível inserir o telefone." + e);
				metodos.getDriver().quit();
			}
	}
	
	public void inserirEnderecoAlternativo(String endereco) {
		try {
			metodos.inserirTexto( signIn.campoDeTextoEnderecoAlternativo(), endereco);
			ObterRelatorio.log(Status.PASS, "Endereço alternativo foi inserido.");
			}catch(Exception e) {
				ObterRelatorio.log(Status.FAIL, "Não foi possível inserir o endereço alternativo." + e);
				metodos.getDriver().quit();
			}
	}
	
	public void preencherEndereco(String endereco, String cidade, String estado, String cep, String pais, String telefone, String enderecoAlternativo){
		inserirEndereco(endereco);
		inserirCidade(cidade);
		selecionaEstado(estado);
		inserirCep(cep);
		selecionarPais(pais);
		inserirTelefone(telefone);
		inserirEnderecoAlternativo(enderecoAlternativo);
	}
	
	
	
	public void register(){
		try {
			metodos.clickElement(signIn.registerBotao());
			ObterRelatorio.log(Status.PASS, "Botão para registrar foi clicado.");
			}catch(Exception e) {
				ObterRelatorio.log(Status.FAIL, "Não foi possível clicar no botão para registrar" + e);
				metodos.getDriver().quit();
			}
	}
	
}
