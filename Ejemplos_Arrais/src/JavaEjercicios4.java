import java.util.Arrays;

import daw.com.Pantalla;


public class JavaEjercicios4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NumeroDePaso  =  0;
		int NumeroPequeño = 10000;
		int NumeroMasAlto = 0;
		
		int [] Vector = new int [5];
		
		Vector [0] = 5; 
		Vector [1] = 999; 
		Vector [2] = 48; 
		Vector [3] = 100; 
		Vector [4] = 1;
		
		for (int i = 0; i < 5 ; i++) {

			NumeroDePaso = Vector [i];
			
			if (NumeroDePaso >= NumeroMasAlto) {
				NumeroMasAlto = NumeroDePaso;
			}
	
			if ( NumeroDePaso <= NumeroPequeño ) {
				NumeroPequeño = NumeroDePaso;
			}
		}
		Arrays.sort(Vector);
		Pantalla.escribirInt(NumeroMasAlto);
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirInt(NumeroPequeño);
		
		
	}

}
