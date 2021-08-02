package frontatendimento.model;

import java.util.List;
import java.util.Map;

public class ValidarCategoriasTratativasBoTiModel {
	
	private List<Map<String, String>> jornadaList;
	private List<Map<String, String>> prodServicoList;
	private List<Map<String, String>> assuntoList;
	public List<Map<String, String>> getJornadaList() {
		return jornadaList;
	}
	public void setJornadaList(List<Map<String, String>> jornadaList) {
		this.jornadaList = jornadaList;
	}
	public List<Map<String, String>> getProdServicoList() {
		return prodServicoList;
	}
	public void setProdServicoList(List<Map<String, String>> prodServicoList) {
		this.prodServicoList = prodServicoList;
	}
	public List<Map<String, String>> getAssuntoList() {
		return assuntoList;
	}
	public void setAssuntoList(List<Map<String, String>> assuntoList) {
		this.assuntoList = assuntoList;
	}

	


}
