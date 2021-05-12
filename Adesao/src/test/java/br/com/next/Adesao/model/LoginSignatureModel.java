package br.com.next.Adesao.model;

public class LoginSignatureModel {
	
	private String cpf;
	private DeviceModel device;
	public String password;
	public String riskScore;
	public String transaction;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public DeviceModel getDevice() {
		return device;
	}

	public void setDeviceModel(DeviceModel device) {
		this.device = device;
	}	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRiskScore() {
		return riskScore;
	}
	public void setRiskScore(String riskScore) {
		this.riskScore = riskScore;
	}
	public String getTransaction() {
		return transaction;
	}
	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}

}
