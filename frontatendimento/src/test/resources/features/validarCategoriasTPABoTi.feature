#language: pt
#encoding: iso-8859-1

@TPA
Funcionalidade: Validar as categorias da TPA
  Quero validar as categorias da TPA disponíveis nos selects Jornada Produto/Servico e Assunto
  

  @tpaBackOffice
  Esquema do Cenario: Validar Categorias BO e TI da TPA
    Dado que eu acesse a tela de ocorrencias na TPA
    Quando eu filtrar as opcoes das categorias na TPA <jornada> e <prodServico> e <assunto>
    Entao as categorias da TPA devem estar com os seus respectivos dados corretos
    Exemplos:
    |login	|senha		|jornada|prodServico|assunto|
    |				|					|				|						|				|