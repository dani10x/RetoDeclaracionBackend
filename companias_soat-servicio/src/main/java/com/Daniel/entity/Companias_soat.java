package com.Daniel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compañias_soat")
public class Companias_soat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nit")
	private String nit;
	
	@Column(name = "nombre")
	private String nombre;

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
