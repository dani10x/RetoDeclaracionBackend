package com.Daniel.response;

import java.sql.Date;

import com.Daniel.entity.Impuesto;

public class ImpuestoResponse {
	
	private double nro_declaracion;
	private VehiculoResponse vehiculoResponse;
	private double valor;
	private Date fecha;
	
	public ImpuestoResponse(Impuesto impuesto) {
		this.nro_declaracion = impuesto.getNro_declaracion();
		this.valor = impuesto.getValor();
		this.fecha = impuesto.getFecha();
	}

	public double getNro_declaracion() {
		return nro_declaracion;
	}

	public void setNro_declaracion(double nro_declaracion) {
		this.nro_declaracion = nro_declaracion;
	}

	public VehiculoResponse getVehiculoResponse() {
		return vehiculoResponse;
	}

	public void setVehiculoResponse(VehiculoResponse vehiculoResponse) {
		this.vehiculoResponse = vehiculoResponse;
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
