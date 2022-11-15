package com.Daniel.response;

import com.Daniel.entity.Clase;

public class ClaseResponse {
	
	private String id_clase;
	private String nombre;
	
	public ClaseResponse(Clase clase) {
		this.id_clase = clase.getId_clase();
		this.nombre = clase.getNombre();
	}

	public String getId_clase() {
		return id_clase;
	}

	public void setId_clase(String id_clase) {
		this.id_clase = id_clase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	
	
}
