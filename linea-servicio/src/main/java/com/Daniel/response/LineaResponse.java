package com.Daniel.response;

import com.Daniel.entity.Linea;

public class LineaResponse {
	
	private String id_linea;
	private String nombre;
	private MarcaResponse marcaResponse;
	
	public LineaResponse(Linea linea) {
		this.id_linea = linea.getId_linea();
		this.nombre = linea.getNombre();
	}

	public String getId_linea() {
		return id_linea;
	}

	public void setId_linea(String id_linea) {
		this.id_linea = id_linea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public MarcaResponse getMarcaResponse() {
		return marcaResponse;
	}

	public void setMarcaResponse(MarcaResponse marcaResponse) {
		this.marcaResponse = marcaResponse;
	}
	
}
