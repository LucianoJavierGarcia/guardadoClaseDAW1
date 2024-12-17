package Ejercicio5;

import daw.com.Pantalla;

public class Funcion {

	private String nombre;
	private float precios;
	
	public Funcion() {
		this.nombre = "";
		this.precios = 0;
	}
	
	public void mostrarDatos() {
		Pantalla.escribirString("El nombre del Teatro es:" + this.nombre);
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("La direccion es:" + this.precios);
		Pantalla.escribirSaltoLinea();
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecios() {
		return precios;
	}

	public void setPrecios(float precios) {
		this.precios = precios;
	}
	
	
	
}
