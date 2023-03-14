package steps;

import elementos.Elementos;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class carrinhoComprasTest {

	Metodos me = new Metodos();
	Elementos el = new Elementos();

	@When("selecionar o campo Fones de Ouvido")
	public void selecionarOCampoFonesDeOuvido() {
	    me.clicar(el.fonesDeOuvido);
	}
	@When("selecionar a opcao que deseja")
	public void selecionarAOpcaoQueDeseja() {
	    me.clicar(el.foneEscolhido);
	}
	@When("adicioná-lo ao carrinho")
	public void adicionáLoAoCarrinho() {
	    me.clicar(el.adicionarCarrinho);
	    me.pausa(2000);
	}
	@Then("valida a inclusao do produto no carrinho de compras")
	public void validaAInclusaoDoProdutoNoCarrinhoDeCompras() {
	    me.clicar(el.validandoTextoCarrinho);
	}



	
	
	
	
	
}
