package com.Daniel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cajas")
public class Caja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_caja")
	private String id_caja;
	
	@Column(name = "nombre")
	private String nombre;

	public String getId_caja() {
		return id_caja;
	}

	public void setId_caja(String id_caja) {
		this.id_caja = id_caja;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
