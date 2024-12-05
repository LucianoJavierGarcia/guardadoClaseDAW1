import daw.com.Pantalla;

public class Imprime_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Forma rapida con un int [][] = new int [3][5];
		//Ir imprimiendo con dos for (uno para que se mueva por las filas y otra para la columnas)
		
		// Correcion de clase
		/*
		 * Con un bucle para darle los valores
		 * Ejemplo del bucle
		 * int filas = 3;
		 * int colunmas = 5;
		 * 
		 * for (int i = 0; i < filas; i++){ la i para las filas
		 * 		for (int j = 0; j < colunas; j++){ la jota seria para recorer las colunmas, para concatenar hay que trasformar los numeros en texto 
		 * 			Pantalla.escribirString("" + (i+1) + (j+1) ); (El "" + es para trasformar los caracteres a texto)
		 * 		}
		 * 		Pantalla.escribirSaltoLinea();
		 * }
		 * 
		 * 
		 */
		
		
		int[] Fila1 = new int [5];
		Fila1[0] = 11;
		Fila1[1] = 12;
		Fila1[2] = 13;
		Fila1[3] = 14;
		Fila1[4] = 15;
		
		for (int i = 0; i < 5 ; i++) {
			Pantalla.escribirString(" " + Fila1[i]); //aqui lo utilize sin darme cuenta, que estaba cambiando el tipo que era lo imprimido
		
		}
		Pantalla.escribirSaltoLinea();
		int[] Fila2 = new int [5];
		Fila2[0] = 21;
		Fila2[1] = 22;
		Fila2[2] = 23;
		Fila2[3] = 24;
		Fila2[4] = 25;
		
		for (int i = 0; i < 5 ; i++) {
			Pantalla.escribirString(" " + Fila2[i]);
		
		}
		Pantalla.escribirSaltoLinea();
		
		int[] Fila3 = new int [5];
		Fila3[0] = 31;
		Fila3[1] = 32;
		Fila3[2] = 33;
		Fila3[3] = 34;
		Fila3[4] = 35;
		
		for (int i = 0; i < 5 ; i++) {
			Pantalla.escribirString(" " + Fila3[i]);
		//Pantalla.escribirSaltoLinea();
		}
		
		
	
		
		
		
		
		
		
	}

}
