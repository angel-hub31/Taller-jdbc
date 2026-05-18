package com.krakedev.entidades;

public class Vehiculo {
	private String placa;
	private String marca;
	private String modelo;
	private int anio;
	private double precio;
	private String color;
	private int kilometraje;
	private boolean disponible;

	// constructor vacio
	public Vehiculo() {

	}

	// cosntructor que recibe parametros
	public Vehiculo(String placa, String marca, String modelo, int anio, double precio, String color,int kilometraje,
			boolean disponible) {

		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.precio = precio;
		this.color = color;
		this.kilometraje=kilometraje;
		this.disponible = disponible;
	}
	
	//getters y setters

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	//metodo toString
	@Override
	public String toString() {
		return "Vehiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", precio="
				+ precio + ", color=" + color + ", kilometraje="+kilometraje+", disponible=" + disponible + "]";
	}

}
