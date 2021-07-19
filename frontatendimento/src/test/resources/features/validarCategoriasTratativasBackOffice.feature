#language: pt


Funcionalidade: Validar as categorias do Tratativas
  Quero validar as categorias disponíveis nos selects Jornada Produto/Servico e Assunto 

  @BackOffice
  Esquema do Cenario: Validar Categorias BackOffice
    Dado que eu acesse o Tratativas com o <login> e <senha>
    Quando eu filtrar as opcoes das categorias BackOffice <jornada> e <prodServico> e <assunto>
    Entao as categorias devem estar com os seus respectivos dados corretos
    Exemplos:
    |login	|senha		|jornada|prodServico|assunto|
    |I932050|testejul	|Adesao	|Nao sei		| NOK		| 
			 