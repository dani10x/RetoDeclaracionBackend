package com.Daniel.response;


public class MunicipioResponse {
	
	private String id_municipio;
	private String nombre;
	private DepartamentoResponse departamentoResponse;

	public String getId_municipio() {
		return id_municipio;
	}

	public void setId_municipio(String id_municipio) {
		this.id_municipio = id_municipio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public DepartamentoResponse getDepartamentoResponse() {
		return departamentoResponse;
	}

	public void setDepartamentoResponse(DepartamentoResponse departamentoResponse) {
		this.departamentoResponse = departamentoResponse;
	}

	

	

	
	
}
