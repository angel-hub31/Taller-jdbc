package com.krakedev.entidades;

public class Vehiculo {
	private String placa;
	private String marca;
	private String modelo;
	private int anio;
	private double precio;
	private String color;
	private boolean disponible;

	// constructor vacio
	public Vehiculo() {

	}

	// cosntructor que recibe parametros
	public Vehiculo(String placa, String marca, String modelo, int anio, double precio, String color,
			boolean disponible) {

		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.precio = precio;
		this.color = color;
		this.disponible = disponible;
	}

}
