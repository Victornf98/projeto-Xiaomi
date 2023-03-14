package steps;

import java.io.IOException;

import elementos.Elementos;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class loginInvalidoTest {

	Metodos me = new Metodos();
	Elementos el = new Elementos();

	@When("preencher de forma incorreta os campos de email ou usuario e senha")
	public void preencherDeFormaIncorretaOsCamposDeEmailOuUsuarioESenha() {
		me.clicar(el.minhaConta);
		me.escrever(el.email, "guilhermesousa@programacao.com.br");
		me.escrever(el.senha, "pwd12345");
	}
	@When("apertar o botao login")
	public void apertarOBotaoLogin() {
		me.clicar(el.btnLogin);
	}
	@Then("o sistema não deve prosseguir para a proxima tela")
	public void oSistemaNãoDeveProsseguirParaAProximaTela() throws IOException {
		me.validarTexto(el.validacaoText,
				"Endereço de e-mail desconhecido. Verifique novamente ou tente seu nome de usuário.");
		me.evidenciarTeste("Captura de tela - login invalido");
	}

}