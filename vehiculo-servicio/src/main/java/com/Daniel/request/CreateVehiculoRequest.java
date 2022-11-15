package com.Daniel.request;

import java.sql.Date;

public class CreateVehiculoRequest {

	private String id_clase;
	private String id_carroceria;
	private String grupo;
	private int puertas;
	private int capacidad_carga;	
	private char blindado;
	private char importado;
	private String compania_soat_nit;
    private String dv;
    private String poliza;
    private Date vencimiento_poliza;
    private String id_caja;
    private String id_traccion;
    private int modelo;
    private int cilindraje;
    private String id_municipio;
    private String id_linea;
	public String getId_clase() {
		return id_clase;
	}
	public void setId_clase(String id_clase) {
		this.id_clase = id_clase;
	}
	public String getId_carroceria() {
		return id_carroceria;
	}
	public void setId_carroceria(String id_carroceria) {
		this.id_carroceria = id_carroceria;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getCapacidad_carga() {
		return capacidad_carga;
	}
	public void setCapacidad_carga(int capacidad_carga) {
		this.capacidad_carga = capacidad_carga;
	}
	public char getBlindado() {
		return blindado;
	}
	public void setBlindado(char blindado) {
		this.blindado = blindado;
	}
	public char getImportado() {
		return importado;
	}
	public void setImportado(char importado) {
		this.importado = importado;
	}
	public String getCompania_soat_nit() {
		return compania_soat_nit;
	}
	public void setCompania_soat_nit(String compania_soat_nit) {
		this.compania_soat_nit = compania_soat_nit;
	}
	public String getDv() {
		return dv;
	}
	public void setDv(String dv) {
		this.dv = dv;
	}
	public String getPoliza() {
		return poliza;
	}
	public void setPoliza(String poliza) {
		this.poliza = poliza;
	}
	public Date getVencimiento_poliza() {
		return vencimiento_poliza;
	}
	public void setVencimiento_poliza(Date vencimiento_poliza) {
		this.vencimiento_poliza = vencimiento_poliza;
	}
	public String getId_caja() {
		return id_caja;
	}
	public void setId_caja(String id_caja) {
		this.id_caja = id_caja;
	}
	public String getId_traccion() {
		return id_traccion;
	}
	public void setId_traccion(String id_traccion) {
		this.id_traccion = id_traccion;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public int getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}
	public String getId_municipio() {
		return id_municipio;
	}
	public void setId_municipio(String id_municipio) {
		this.id_municipio = id_municipio;
	}
	public String getId_linea() {
		return id_linea;
	}
	public void setId_linea(String id_linea) {
		this.id_linea = id_linea;
	}
}
