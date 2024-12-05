import java.util.Arrays;

import daw.com.Pantalla;
import daw.com.Teclado;

public class Ordenar_arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  
		int NumDimencion =  Teclado.leerInt("Escribe la dimención de tu array: " ) ;
		
		int [] Dimencion = new int [NumDimencion ];
		
		for (int i = 0; i < NumDimencion ; i++) {
			
			int Num =  Teclado.leerInt("Escribe el numero: ");
	
			Dimencion [i] = Num;

		}
		Arrays.sort(Dimencion);
		for (int j = 0; j <= NumDimencion - 1;j++) {
			Pantalla.escribirInt(Dimencion[j]);
			Pantalla.escribirSaltoLinea();
			
		}
	
		
		
	}

}
