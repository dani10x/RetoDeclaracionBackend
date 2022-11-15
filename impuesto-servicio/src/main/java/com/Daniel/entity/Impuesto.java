package com.Daniel.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "declaracion_de_impuestos")
public class Impuesto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nro_declaracion")
	private int nro_declaracion;
	
	@Column(name = "vehiculo_placa")
	private String placa;
	
	@Column(name = "valor")
	private double valor;
	
	@Column(name = "fecha")
	private Date fecha;

	public double getNro_declaracion() {
		return nro_declaracion;
	}

	public void setNro_declaracion(int nro_declaracion) {
		this.nro_declaracion = nro_declaracion;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
