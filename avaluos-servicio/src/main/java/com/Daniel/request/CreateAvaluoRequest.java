package com.Daniel.request;

public class CreateAvaluoRequest {

	private String clase_id_clase;
	
	private int modelo;
	
	private int cilindraje;
	
	private int valor;
	
	private String linea_id_linea;

	public String getClase_id_clase() {
		return clase_id_clase;
	}

	public void setClase_id_clase(String clase_id_clase) {
		this.clase_id_clase = clase_id_clase;
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

	public String getLinea_id_linea() {
		return linea_id_linea;
	}

	public void setLinea_id_linea(String linea_id_linea) {
		this.linea_id_linea = linea_id_linea;
	}
}
