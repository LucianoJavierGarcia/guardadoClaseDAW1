package rectangulo;

import daw.com.Pantalla;
import daw.com.Teclado;

public class Rectangulo {
	
	private Punto centro;
	private int largo;
	private int ancho;
	private int color;
	
	public Rectangulo() {
		//Rectangolo sin datos introduccidos , rectangulos base
		this.centro = new Punto();
		this.largo = 2;
		this.ancho = 1;
		this.color = 0;
		
	}
	
	public Rectangulo (int largo, int ancho, int color, Punto centro) {
		// constructor con todos los parametros introduccidos
		this.largo = largo;
		this.ancho = ancho;
		this.centro = centro;
		this.color = color;

	}
	
	public Rectangulo (Rectangulo rectangulo) {
		//Esta funcion crea una copia como un nuevo objeto de los datos
		this.largo =rectangulo.largo;
		this.ancho = rectangulo.ancho;
		this.centro = rectangulo.centro;
		this.color = rectangulo.color;
	}
	
	public int getLargo () {
		return largo;
	}
	
	public void setLargo (int largo) {
		this.largo = largo;
	}
	
	public int getAncho () {
		return ancho;
	}
	
	public void setAncho (int ancho) {
		this.ancho = ancho;
	}
	
	//aqui para mostrar los datos
	 public void mostrarDatos() {
	        Pantalla.escribirString("Rectángulo:");
	        Pantalla.escribirSaltoLinea();
	        Pantalla.escribirString("Largo: " + largo);
	        Pantalla.escribirSaltoLinea();
	        Pantalla.escribirString("Ancho: " + ancho);
	        Pantalla.escribirSaltoLinea();
	        Pantalla.escribirString("Color: " + color);
	        Pantalla.escribirSaltoLinea();
	        Pantalla.escribirString("Centro:");
	        centro.mostrarDatos();
	    }

	 public void cambiarDatos() {
		    // Mensaje inicial para el usuario
		   	Pantalla.escribirString("Introduce nuevos datos del rectángulo. Si no quieres cambiar un dato, escribe -1:");

		    // Pedir el nuevo valor de largo
			Pantalla.escribirString("Nuevo largo (actual: " + this.largo + "): ");
		    int nuevoLargo = Teclado.leerInt();
		    if (nuevoLargo != -1) {
		        this.largo = nuevoLargo;
		    }

		    // Pedir el nuevo valor de ancho
			Pantalla.escribirString("Nuevo ancho (actual: " + this.ancho + "): ");
		    int nuevoAncho = Teclado.leerInt();
		    if (nuevoAncho != -1) {
		        this.ancho = nuevoAncho;
		    }

		    // Pedir el nuevo valor de color
			Pantalla.escribirString("Nuevo color (actual: " + this.color + "): ");
		    int nuevoColor = Teclado.leerInt();
		    if (nuevoColor != -1) {
		        this.color = nuevoColor;
		    }

		    // Pedir las nuevas coordenadas del centro
			Pantalla.escribirString("Introduce las nuevas coordenadas del centro:");
			Pantalla.escribirString("Nueva coordenada X (actual: " + this.centro.getX() + "): ");
		    int nuevaX = Teclado.leerInt();
		    if (nuevaX != -1) {
		        this.centro.setX(nuevaX);
		    }

			Pantalla.escribirString("Nueva coordenada Y (actual: " + this.centro.getY() + "): ");
		    int nuevaY = Teclado.leerInt();
		    if (nuevaY != -1) {
		        this.centro.setY(nuevaY);
		    }
		}
	
	
	
	
	
}
