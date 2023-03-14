
@all
Feature: Acessando minha conta
  Eu como usuario
  Quero acessar minha conta 
  Para comprar um produto

Background:
 Given que o usuario esteja na home

  @teste1 @all
  Scenario: Login invalido
   When preencher de forma incorreta os campos de email ou usuario e senha
   And apertar o botao login
   Then o sistema não deve prosseguir para a proxima tela

  @teste2 @all
  Scenario: Login valido
   When preencher os campos de email ou usuario e senha 
   And pressionar o botao login 
   Then valido a funcionalidade
   
   
  