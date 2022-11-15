package com.Daniel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clase")
public class Clase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_clase")
	private String id_clase;
	
	@Column(name = "nombre")
	private String nombre;

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
