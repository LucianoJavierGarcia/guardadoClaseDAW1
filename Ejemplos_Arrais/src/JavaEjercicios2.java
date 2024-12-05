import daw.com.Pantalla;
import daw.com.Teclado;

public class JavaEjercicios2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

float [][] matriz = new float [4] [4];
		
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					matriz[i][j] = (float) 1.0; 
				}
			}
			
		}
		
		int Fila =  Teclado.leerInt("Diga la posicion del numero que desea buscar en la matriz, primero en que fila (4X4)");
		int Columna =  Teclado.leerInt("Ahora la comuna");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == Columna && j == Fila )
				
				Pantalla.escribirFloat( matriz [i][j]);
			}
		}
		
		
	}

}
