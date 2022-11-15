package com.Daniel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "traccion")
public class Traccion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_traccion")
	private String id_traccion;
	
	@Column(name = "nombre")
	private String nombre;

	public String getId_traccion() {
		return id_traccion;
	}

	public void setId_traccion(String id_traccion) {
		this.id_traccion = id_traccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	

	
	
}
