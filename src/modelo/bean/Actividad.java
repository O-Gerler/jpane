package modelo.bean;

import java.util.Date;

public class Actividad {
	
	private int idActividad;
	private String nombre;
	private Date fechaInicio;
	private String diasSemana;
	private int horas;
	private int maxParticipantes;
	private double precio;
	
	
	public int getIdActividad() {
		return idActividad;
	}
	public void setIdActividad(int idActividad) {
		this.idActividad = idActividad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getDiasSemana() {
		return diasSemana;
	}
	public void setDiasSemana(String diasSemana) {
		this.diasSemana = diasSemana;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getMaxParticipantes() {
		return maxParticipantes;
	}
	public void setMaxParticipantes(int maxParticipantes) {
		this.maxParticipantes = maxParticipantes;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String toString() {
		return "nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", diasSemana=" + diasSemana
				+ ", horas=" + horas + ", maxParticipantes=" + maxParticipantes + ", precio=" + precio ;
	}

}
