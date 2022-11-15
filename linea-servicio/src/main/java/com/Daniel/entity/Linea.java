package com.Daniel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "linea")
public class Linea {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_linea")
	private String id_linea;
	
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "marca_id_marca")
	private String id_marca;

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

	public String getId_marca() {
		return id_marca;
	}

	public void setId_marca(String id_marca) {
		this.id_marca = id_marca;
	}
	
}
