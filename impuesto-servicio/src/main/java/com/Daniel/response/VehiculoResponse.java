package com.Daniel.response;

import java.sql.Date;

public class VehiculoResponse {
	
	private String placa;
	private ClaseResponse claseResponse;
	private CarroceriaResponse carroceriaResponse;
	private String grupo;
	private int puertas;
	private int capacidad_carga;
	private char blindado;
	private char importado;
	private Compania_soatResponse compania_soatResponse;
    private String dv;
    private String poliza;
    private Date vencimiento_poliza;
    private CajaResponse cajaResponse;
    private TraccionResponse traccionResponse;
    private int modelo;
    private int cilindraje;
    private MunicipioResponse municipioResponse;
    private LineaResponse lineaResponse;
	

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public ClaseResponse getClaseResponse() {
		return claseResponse;
	}

	public void setClaseResponse(ClaseResponse claseResponse) {
		this.claseResponse = claseResponse;
	}

	public CarroceriaResponse getCarroceriaResponse() {
		return carroceriaResponse;
	}

	public void setCarroceriaResponse(CarroceriaResponse carroceriaResponse) {
		this.carroceriaResponse = carroceriaResponse;
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

	public Compania_soatResponse getCompania_soatResponse() {
		return compania_soatResponse;
	}

	public void setCompania_soatResponse(Compania_soatResponse compania_soatResponse) {
		this.compania_soatResponse = compania_soatResponse;
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

	public CajaResponse getCajaResponse() {
		return cajaResponse;
	}

	public void setCajaResponse(CajaResponse cajaResponse) {
		this.cajaResponse = cajaResponse;
	}

	public TraccionResponse getTraccionResponse() {
		return traccionResponse;
	}

	public void setTraccionResponse(TraccionResponse traccionResponse) {
		this.traccionResponse = traccionResponse;
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

	public MunicipioResponse getMunicipioResponse() {
		return municipioResponse;
	}

	public void setMunicipioResponse(MunicipioResponse municipioResponse) {
		this.municipioResponse = municipioResponse;
	}

	public LineaResponse getLineaResponse() {
		return lineaResponse;
	}

	public void setLineaResponse(LineaResponse lineaResponse) {
		this.lineaResponse = lineaResponse;
	}
}
