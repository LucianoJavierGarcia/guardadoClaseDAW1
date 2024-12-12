package Ejercicio5;

import daw.com.Pantalla;

public class Triangulo {
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		//costructor basica
		this.altura = altura;
		this.base = base;
	}
	
	public void mostrarDatos() {
		Pantalla.escribirString("La base es:" + this.base);
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("La altura es:" + this.altura);
		Pantalla.escribirString("El area del triangulo es de " + area());
		Pantalla.escribirString("El perimetro total es " + perimetro());
	}
	
	public Double area() {
		//o returnamos esta funcion o hacemos que lo imprima por pantalla, hay que elegir
		
		return (this.base / 2) * this.altura;
	}
	
	public double perimetro() {
		//para proceder , hacer la midad de la base por la altura, vamos aplicar pitagoras ;
		//Luego hacer la suma de las hipotenusas y la base.
		
		double hipotenusaAlCuatrado = Math.pow ((this.base/2), 2 ) + (this.altura * this.altura) ;
		double hipotenusaNormal= Math.sqrt(hipotenusaAlCuatrado);
		double areaTotal = hipotenusaNormal + hipotenusaNormal + this.base;
		
		return areaTotal;
	}
	
	

}
