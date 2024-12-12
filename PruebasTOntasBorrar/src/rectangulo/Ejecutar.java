package rectangulo;
import daw.com.Pantalla;

public class Ejecutar {

	public static void main(String[] args) {
		
		Rectangulo2 prueba = new Rectangulo2(4, new Punto(5,7), 5.0, 3.0);
		
		prueba.mostrarDatos();
		 
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("-----------------------------------");
		Pantalla.escribirSaltoLinea();
		
		Rectangulo2 copia = new Rectangulo2(prueba);

		copia.mostrarDatos();
		
		prueba.getCentro().setX(2);
		
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("-----------------------------------");
		Pantalla.escribirSaltoLinea();
		
		prueba.mostrarDatos();
		
		prueba.cambiarDatos();
		prueba.mostrarDatos();
		
		
	}

}