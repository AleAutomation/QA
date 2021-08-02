#language: pt
#encoding: iso-8859-1

@Tratativas
Funcionalidade: Validar as categorias do Tratativas
  Quero validar as categorias disponíveis nos selects Jornada Produto/Servico e Assunto
  
  Contexto:
    Dado que eu acesse o Tratativas com os dados
    |login	|senha		|
    |I931150|testeago	| 
  
  

  @BackOffice
  Cenario: Validar Categorias BackOffice
  	Quando eu acessar a aba BackOffice
  	|abaTratativasBo|
  	|Backoffice			|
    Quando eu filtrar as opcoes das categorias do Tratativas
    |jornada			|produtoServicos	|assunto|
    |INVESTIMENTOS|POUPANÇA					|DIVERGENCIA DE VALORES	|
    |PORTABILIDADE|OBJETIVOS				|APLICAÇÃO							|
    |PARCERIAS		|OUTROS						|RESGATE								|
    Entao as categorias devem estar com os seus respectivos dados corretos
    
  @OcorrenciaTi
  Cenario: Validar Categorias OcorrenciaTi
  	Quando eu acessar a aba OcorrenciaTi
  	|abaTratativasTi|
  	|Ocorrência/TI	|
    Quando eu filtrar as opcoes das categorias de OcorrenciaTi
    |jornadaTi						|produtoServicosTi|assuntoTi																							|
    |ATM									|SENHA						|OUTROS																									|
    |Parcerias DisneyPlus	|DisneyPlus - Site|Erro no direcionamento para o site: NEXT.ME/DISNEYPLUS	|
    |Aplicativo						|Funcionalidades	|Não está atualizando o telefone celular								|
    Entao as categorias da OcorrenciaTi devem estar com os seus respectivos dados corretos