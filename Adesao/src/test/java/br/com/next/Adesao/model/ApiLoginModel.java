package br.com.next.Adesao.model;

import java.util.List;

public class ApiLoginModel {
	
	public List<Apps> apps;
	public LoginSignatureModel loginSignature;
	
	
	
	public List<Apps> getApps() {
		return apps;
	}
	public void setApps(List<Apps> apps) {
		this.apps = apps;
	}
	public LoginSignatureModel getLoginSignature() {
		return loginSignature;
	}
	public void setLoginSignature(LoginSignatureModel loginSignature) {
		this.loginSignature = loginSignature;
	}
}
