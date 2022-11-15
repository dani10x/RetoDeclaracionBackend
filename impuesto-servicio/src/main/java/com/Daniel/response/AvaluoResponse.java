package com.Daniel.response;


public class AvaluoResponse {
	
	private String id_avaluo;
	private ClaseResponse claseResponse;
	private int modelo;
	private int cilindraje;
	private int valor;
	private LineaResponse lineaResponse;

	public String getId_avaluo() {
		return id_avaluo;
	}

	public void setId_avaluo(String id_avaluo) {
		this.id_avaluo = id_avaluo;
	}

	public ClaseResponse getClaseResponse() {
		return claseResponse;
	}

	public void setClaseResponse(ClaseResponse claseResponse) {
		this.claseResponse = claseResponse;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public LineaResponse getLineaResponse() {
		return lineaResponse;
	}

	public void setLineaResponse(LineaResponse lineaResponse) {
		this.lineaResponse = lineaResponse;
	}

	
	
}
