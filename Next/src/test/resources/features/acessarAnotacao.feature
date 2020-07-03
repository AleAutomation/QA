#language: pt
Funcionalidade: Acessar o localhost Anotacoes

@anotacao
  Cenario: Acessar Anotacoes
    Dado que eu acesse o anotacoes
    Quando eu clicar no botao Clique Aqui
    Entao a pagina anotacoes deve aparecer
  
  @wde
  Cenario: Acessar WDE
  	Dado que eu acesse o WDE Desktop
  	Quando eu inserir os dados
  	|usuario| senha		| servidor					| porta	|
  	|I932550| testejul|wde_favoritesremoto|2030		|
  	E eu clicar em Conectar
  	Entao o Wde deve ser acessado com sucesso
