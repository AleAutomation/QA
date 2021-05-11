#language: pt

	Funcionalidade: Realizar adesão titular
		Fazer uma adesão para gerar o token e utilizar nos testes pre-sit
		
		Esquema do Cenario: Criar adesao titular
		Dado que eu faca uma requisicao Post Pre Registration <preRegistration>
		Dado que eu faca uma requisicao Post User Password <userPassword>
		Dado que eu faca uma requisicao Post Login <login>
		Dado que eu faca uma requisicao Post Pegar Customer ID <pegarCustomerId>
		Dado que eu faca uma requisicao Put Application <applicationPut>
		Quando eu enviar um video <docVideo> em uma requisicao Get <reqGetVideo> 
		Quando eu enviar os arquivos <docArquivos> em uma requisicao Get <reqGetArq>
		
		Exemplos:
		|preRegistration		| userPassword		|login		|pegarCustomerId	|applicationPut							|docVideo	|reqGetVideo|docArquivos|reqGetArq|
		|/v2/preregistration|/v2/userPassword	|/v2/login|/v1/login/system	|/v2/onboarding/applications|					|						|						|					|
		