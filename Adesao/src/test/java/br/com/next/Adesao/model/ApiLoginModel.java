package br.com.next.Adesao.model;

import java.util.List;

public class ApiLoginModel {
	
	public List<Apps> apps;
	public LoginSignatureModel loginSignature;
	private String token;
	private String deviceId;
	
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
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	@Override
	public String toString() {
		return "ApiLoginModel [token=" + token + ", deviceId=" + deviceId + "]";
	}
	
	
}
