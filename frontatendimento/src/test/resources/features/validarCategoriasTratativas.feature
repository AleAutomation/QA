#language: pt


Funcionalidade: Validar as categorias do Tratativas
  Quero validar as categorias dispon�veis nos selects Jornada Produto/Servico e Assunto 

  @BackOffice
  Cenario: Validar Categorias BackOffice
    Dado que eu acesse o Tratativas com o Login <login> e Senha <senha>
    Quando eu filtrar as opcoes das categorias BackOffice Jornada <jornada> ProdutoServico <prodServico> e Assunto <assunto>
    Ent�o as categorias devem estar com os seus respectivos dados corretos
			 