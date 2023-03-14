
@testBusca
Feature: Pesquisando produto pela barra de busca
  Eu como usuario
  Quero encontrar um produto pela barra de pesquisa
  Para verificar sua disponibilidade

Background:
 Given que o usuario esteja na home

  @testBusca
  Scenario: Pesquisando produto
   
    When escrever o nome do produto na barra de pesquisa
    And apertar a lupa
    Then o sistema deve direcioná-lo para a pagina com a opcao do produto
   


 
