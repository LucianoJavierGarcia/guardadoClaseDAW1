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
	
	public Rectangulo (Rectangulo rectanguloNuevo) {
		//Esta funcion crea una copia como un nuevo objeto de los datos
		// En este constructor hay un problema, explicado el dia/12/24
		/*
		 * El problema esta en el centro, puesto como es un objeto, los dos se referirian al mismo objeto.
		 * Siendo que si se cambia el centro en algun momento el segundo tambien  cambiara su centro!!!!
		 * Para que esto no pase, en este caso reservamos un nuevo espacio de memoria con otro nuevo objeto para la copia para asi, poder cambiar el originar sin cambiar la copia.
		 * 
		 */
		this.largo =rectanguloNuevo.largo;
		this.ancho = rectanguloNuevo.ancho;
		this.centro = new Punto(rectanguloNuevo.centro);// aqui creamos un objeto punto al rectangulo y asignarselo al centro
		this.color = rectanguloNuevo.color;
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
	//El uso de String.valueOf(); Trasforma cualquier cosa a un String para poder mostrarlo
	// Con valores Booleanos se le puede poner delante ! para negar, cuidado se puede poner multiples ! y joder el la negacion.
	//parce.... sirve para el cambio de variables como el .vauleOf();
	
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
	
	 //Como debugear el codigo:
	 
	 /*
	  * Extructura de comprobacion
	  * 
	  * try{
	  * 	codigo que comprobar
	  * }catch(NumberFormatExepcion) {
	  * 
	  * System.out.println("ERROR");
	  * 
	  * }
	  * 
	  * Funciona primero colocando el codigo que queremos comprobar, luego el catch le ponemos el tipo de exepcion que va a salir, al final le damos alque que ejecutar
	  * Asi "Solucionamos" parcialmente un error que detenga a Java, asi no impidiendole seguir adelante con el codigo.
	  * Cuidado de abusar de este metodo, si no el codigo se volvera ilegible.
	  * 
	  */
	
	
	
	
}
