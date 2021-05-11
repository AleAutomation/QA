package com.squadwde.next.page;

import org.openqa.selenium.By;

import com.squadwde.next.core.WinDriverPage;
import com.squadwde.next.model.WdeLoginModel;

public class WdeLoginPage {
	
	WinDriverPage winPage = new WinDriverPage();
	
	public void abrirWde() {
		winPage.openTool("C:/Users/alexsandroramos/Desktop/WDE-SIT/InteractionWorkspace.exe");
	}

	public void inserirDadosLogin(WdeLoginModel wdeLoginModels) {
		winPage.limparCampo(By.id("UserName"));
		winPage.escreverTexto(By.id("UserName"), wdeLoginModels.getUsuario());
		winPage.escreverTexto(By.id("passwordBoxPassword"), wdeLoginModels.getSenha());
		winPage.clicarBotao(By.id("HeaderSite"));
		winPage.clicarBotao(By.name("Conectar"));
		winPage.aguardarElementoClicavelAparecer(By.id("HamburgerButton"), 20);
		winPage.clicarBotao(By.id("HamburgerButton"));
		winPage.aguardarElementoClicavelAparecer(By.id("ContactDirectory"), 10);
		winPage.clicarBotao(By.id("ContactDirectory"));
		winPage.aguardarElementoClicavelAparecer(By.id("QuickSearchTextBox"), 5);
		winPage.escreverTexto(By.id("QuickSearchTextBox"), "Next");
		winPage.clickEnter(By.id("QuickSearchTextBox"));
		
	}
	

}