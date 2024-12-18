package Ejercicio5;

import daw.com.Pantalla;
import daw.com.Teclado;

/*
	 * Si en un ejercicio pone "caracteriaza por , contien X" son propiedades del objeto
	 * Dos clases
	 * 
	 * Class Teatro
	 * private String nombre 
	 * private String direcion
	 * La direccion no tendra un seter puesto que no podemos modificar la direccion, no podemos cambiar el lugar del teatro
	 * No constructores vacios
	 * Private Funcion[4] funciones;
	 * 
	 * Funcion.class
	 * Private String nombre
	 * Pirvate float/double precios
	 * Puede haber constructores vacios
	 * 
	 * 
	 */
public class Teatro {

	private String nombre;
	private String direcion;
	private Funcion[] funciones;
	
	public Teatro (String nombre, String direcion) {
		
		this.nombre = nombre;
		this.direcion = direcion ;
		this.funciones = new Funcion [4];
	}
	
	public void mostrarDatos() {
		Pantalla.escribirString("El nombre del Teatro es:" + this.nombre);
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("La direccion es:" + this.direcion);
		Pantalla.escribirSaltoLinea();
		
		for ( int i = 0; i < 4; i++) {
			if( this.funciones[i] != null) {
				this.funciones[i].mostrarDatos();
			}
			
		}
		
		
	}
	
	public void llenarFunciones() {
		for(int i =0; i<4;i++) {
			
			//this.Teatro.setFunciones(new Funcion(), i);
			//this.nombre.getFunciones()[i].setNombre(Teclado.leerString("Di el nombre de la funcion"));
			//nuevoTeatro.getFunciones()[i].setPrecios(Teclado.leerFloat("Di el precio de la fucion"));
			
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Funcion[] getFunciones() {
		return funciones;
	}

	//Cambio pequeño de este seter
	public void setFunciones(Funcion[] funciones) {
		this.funciones = funciones;
	}

	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}
}

