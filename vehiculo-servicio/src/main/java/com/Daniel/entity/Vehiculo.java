package com.Daniel.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "placa")
	private String placa;
	
	@Column(name = "clase_id_clase")
	private String id_clase;
	
	@Column(name = "carroceria_id_carroceria")
	private String id_carroceria;
	
	@Column(name = "grupo")
	private String grupo;
	
	@Column(name = "nro_puertas")
	private int puertas;
	
	@Column(name = "capacidad_carga")
	private int capacidad_carga;
	
	@Column(name = "blindado")
	private char blindado;
	
	@Column(name = "importado")
	private char importado;
	
	@Column(name = "compañias_soat_nit")
	private String compania_soat_nit;
	
    @Column(name = "dv")
    private String dv;
    
    @Column(name = "nro_poliza")
    private String poliza;
	
    @Column(name = "vencimiento_poliza")
    private Date vencimiento_poliza;
    
    @Column(name = "cajas_id_caja")
    private String id_caja;
    
    @Column(name = "traccion_id_traccion")
    private String id_traccion;
    
    @Column(name = "modelo")
    private int modelo;
    
    @Column(name = "cilindraje")
    private int cilindraje;
    
    @Column(name = "municipios_id_municipio")
    private String id_municipio;
    
    @Column(name = "linea_id_linea")
    private String id_linea;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

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
