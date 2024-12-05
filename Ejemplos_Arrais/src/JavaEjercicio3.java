import daw.com.Pantalla;

public class JavaEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 0;
		int NumeroDePaso = 0;
		int NumeroMasAlto = 0;
		
			int [] ListaDenumeros = new int [5]; 
			ListaDenumeros [0] = 5; 
			ListaDenumeros [1] = 999; 
			ListaDenumeros [2] = 48; 
			ListaDenumeros [3] = 100; 
			ListaDenumeros [4] = 0; 
			
			for (int i = 0; i < 5 ; i++) {

				NumeroDePaso = ListaDenumeros [i]; 
				
				if (NumeroDePaso >= NumeroMasAlto) {
					NumeroMasAlto = NumeroDePaso;
					j = i ;
				}
				
				if (i == 4){
					Pantalla.escribirInt("El numero mas alto es el ", NumeroMasAlto);
					Pantalla.escribirSaltoLinea();
					Pantalla.escribirInt("Esta en la posición ", j);
					
				}
			}
		
		
		
	}

}
