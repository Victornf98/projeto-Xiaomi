
@carrinho
Feature: Adicionando fone de ouvido ao carrinho de compras
  Eu como usuario 
  Quero adicionar um fone de ouvido ao carrinho
  Para efetuar a compra

Background:
 Given que o usuario esteja na home

  @carrinho
  Scenario: Adicao do produto no carrinho
    
    When selecionar o campo Fones de Ouvido
    And selecionar a opcao que deseja
    And adicioná-lo ao carrinho
    Then valida a inclusao do produto no carrinho de compras
    

  
