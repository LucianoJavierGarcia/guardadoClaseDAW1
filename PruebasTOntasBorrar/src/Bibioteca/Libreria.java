package Bibioteca;
import daw.com.*;

public class Libreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ver=Libreria.esBisiesto();
		System.out.println(ver)
;		
}
	
public static void trocearString (String texto) {
		for (int i = 0; i < texto.length();i++)
			System.out.println(texto.charAt(i));
		
	}

public static int leerEnteroPositivo () {
	int enteroLeido;
	do {
		enteroLeido = Teclado.leerInt("Introducce un número entero ");
} while (enteroLeido<1);
	return enteroLeido;
}

public static boolean esPrimo () {
	//volver luego para revisar while numero primo!!!!!
	//buscado por google cualquier numero que sea menor a uno no puede ser un primo por definicion. Maldicion.....
	//con esto en cuenta primero recibir el numero y comprobar si es positivo
	int leerPrimo = Teclado.leerInt("Escriba el nuemro que quiere saber si es primo");
	if (leerPrimo <= 1) {
		return false;
	}
	//Vale ahora comprobado que sea positivo, como sigo....
	// Ok no tengo ni idea de como hacer si son primos....
	if (leerPrimo % leerPrimo == 0) {}
	
	return true;
}

public static int leerEntreLimites () {
	
	int Max ;
	int Min ;
	int num;
	do {
		Max = Teclado.leerInt("Introducce un numero que sera el maximo  ");
		Min = Teclado.leerInt("Introducce un numero que sera el minimo  ");
		// utilizacion del while como comprobacion de que se cumpla el orden de introduccion del limite;
	}while(Min > Max && Max < Min); 	
	
	do {
		num = Teclado.leerInt("introduce un numero que este entre los limites antes dados");
	}while (num < Max && num > Min);
	
	return num; 
	
	
}

public static boolean esBisiesto () {
	//Error en el while, no se que parametros poner para indentificar el bisiesto, se procede a buscar el ejercicio en Pseint;
	// Vale solucionado, pero no se como poner que pueda retornar falso;
	/*
	 * Codigo el cual se le introduce un año para su comprobacion de la condicion hata que sea verdadero
	 * solucionado para el false;
	 */
	int año;
		año = Teclado.leerInt("Introducca el año para saber si es bisiesto, se devolvera un true o false ");
		
	if (año%4 == 0 && año%100 == 0 || año%400 !=0 ) {
		
			 return true;
	} else {
		return false;
	}
			
		
}


public static int generarAleatorio () {

	//solucion temporal y sacada de fuentes no propias.
	int Max ;
	int Min ;
	int numAleatorio ;
	do {
		Max = Teclado.leerInt("Introducce un numero que sera el maximo  ");
		Min = Teclado.leerInt("Introducce un numero que sera el minimo  ");
		numAleatorio = (int) (Math.random() * (Max - Min + 1)) + Min;
		Pantalla.escribirInt("Su numero aleatorio es el: ", numAleatorio);
	}while (numAleatorio != 0);{
		return numAleatorio;
	}
}

public static String[] crearArrayString() {
	
	// Copia y pega del primer ejercicio mandado de arrays
	/*
	 * Primero das la longitud del array, lo llenas dentro del for y devuelves el array ya formado
	 *  ojo no tiene proteccion de tipo.
	 *  arreglado
	 */
	
	int largo = Teclado.leerInt("Escriba la longitud de su Array de letras");
	String arrayString [] = new String [largo];
	for (int i = 0; i < largo; i++ ) {
		String palabra = Teclado.leerString();
		arrayString [i] = palabra;
		
	}
	return arrayString ;
}
	
public static int [] crearArrayInt() {
	//una vez solucionado el primer array, es copiar y pegar cambiando por int
	/*
	 * Primero das la longitud del array, lo llenas dentro del for y devuelves el array ya formado
	 * ojo no tiene proteccion de tipo.
	 * arreglado
	 */
	
	int longitud = Teclado.leerInt("Escriba la longirud de su Array de numeros");
	int [] ArrayNumeros = new int [longitud]; 
	
	for (int i = 0; i < longitud; i++ ) {
		
		int num = Teclado.leerInt("Escriba el numero");
		ArrayNumeros [i] = num;
	}
	return ArrayNumeros ;
}
	
	
	
} 
	
