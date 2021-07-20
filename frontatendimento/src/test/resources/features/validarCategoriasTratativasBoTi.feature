#language: pt
#encoding: iso-8859-1

@Tratativas
Funcionalidade: Validar as categorias do Tratativas
  Quero validar as categorias disponíveis nos selects Jornada Produto/Servico e Assunto 

  @BackOffice
  Esquema do Cenario: Validar Categorias BackOffice
    Dado que eu acesse o Tratativas com o <login> e <senha>
    Quando eu filtrar as opcoes das categorias BackOffice <jornada> e <prodServico> e <assunto>
    Entao as categorias devem estar com os seus respectivos dados corretos
    Exemplos:
    |login	|senha		|jornada|prodServico			|assunto										|
    |I931650|testejul	|Adesão	|Abertura de Conta| Dúvidas sobre documentação| 
    
  @OcorrenciaTi
  Esquema do Cenario: Validar Categorias OcorrenciaTi
    Dado que eu acesse o Tratativas OcorrenciasTi com o <loginTi> e <senhaTi>
    Quando eu filtrar as opcoes das categorias de OcorrenciaTi <jornadaTi> e <prodServicoTi> e <assuntoTi>
    Entao as categorias da OcorrenciaTi devem estar com os seus respectivos dados corretos
    Exemplos:
    |loginTi	|senhaTi		|jornadaTi							|prodServicoTi			|assuntoTi																							|
    |I931550	|testejul		|Parcerias DisneyPlus		|DisneyPlus - Site	| Erro no direcionamento para o site: NEXT.ME/DISNEYPLUS|