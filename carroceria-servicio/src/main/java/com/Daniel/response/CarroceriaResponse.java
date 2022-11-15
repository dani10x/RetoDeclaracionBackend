package com.Daniel.response;

import com.Daniel.entity.Carroceria;

public class CarroceriaResponse {
	
	private String id_carroceria;
	private String nombre;
	
	public CarroceriaResponse(Carroceria carroceria) {
		this.id_carroceria = carroceria.getId_carroceria();
		this.nombre = carroceria.getNombre();
	}

	public String getId_carroceria() {
		return id_carroceria;
	}

	public void setId_carroceria(String id_carroceria) {
		this.id_carroceria = id_carroceria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
