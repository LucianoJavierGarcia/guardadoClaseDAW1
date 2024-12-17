package Ejercicio5;

import daw.com.Pantalla;

public class EjecutarTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Triangulo prueba = new Triangulo (4.0,7.0);
		
		prueba.mostrarDatos();
		 */
		/*
		//Generar casos de prueba
		int NumerosTriangulos = 10;
		Triangulo[] arrayTriangulos = new Triangulo[NumerosTriangulos];
		
		for (int i = 0; i < NumerosTriangulos; i++) {
			arrayTriangulos [i] = new Triangulo (Math.random()*5, Math.random()*3);
			Pantalla.escribirSaltoLinea();
			arrayTriangulos[i].mostrarDatos();
			
			
		}
		//Funcionalidad o funcion pedida
		
		comprobarAreaMayor(arrayTriangulos);
		*/
		
		
		
		
		
	}
	//Cosa para buscar "widening casting" y "Stortening casting". Tambien buscar los problemas que puede dar
	public static void crearTeatroConFunciones () {
		Teatro nuevoTeatro = new Teatro ("Teatro LJ","Plaza castilla");
		nuevoTeatro.mostrarDatos();
		
		for(int i =0; i<4;i++) {
			nuevoTeatro.setFunciones(new Funcion(), i);
			nuevoTeatro.getFunciones()[i].setNombre("El capitan america contra los taxistas de Atocha");
			nuevoTeatro.getFunciones()[i].setPrecios(Math.round(Math.random()*10));
			
		}
	}
	
	public static void comprobarAreaMayor(Triangulo [] array) {
			//Los objertos tienen una serie de propiedades, en este caso el .length no lleva () por que no es un metodo. 
		
		double areaMayor = 0.0;
		int indiceMayor = 0;
		
		for (int i = 0; i < array.length; i++) {
			double elementoActual = array[i].area(); 
			
			if (areaMayor < elementoActual) {
				
				areaMayor = elementoActual;
				indiceMayor = i;
			}
			
		}
		Pantalla.escribirString("El area mayor es " + areaMayor);
		Pantalla.escribirString("Es el nuemro mayor es el numeo " + ( indiceMayor+1));
	}

}
