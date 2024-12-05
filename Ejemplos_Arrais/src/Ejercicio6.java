import daw.com.Pantalla;
import daw.com.Teclado;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int[] vector = new int [10];
		int posicionMayor = 0;
		int sumaMayor = 0;
		
		while (i < 10 ) {
			vector[i] = Teclado.leerInt("Escribe un numero " + (i+1) + ": ");
			
			int sumaRecibida = 0;
			int numeroMayor = vector [posicionMayor];
			int numeroRecibida = vector[i];
			
			while (numeroMayor > 0 ) {
				sumaMayor += numeroMayor % 10 ;
				numeroMayor += numeroMayor / 10;
			}
			
			while (numeroMayor > 0 ) {
				sumaRecibida = numeroRecibida % 10 ;
				numeroMayor = numeroRecibida / 10;
			}
			
			
			if (sumaMayor < sumaRecibida) {
			posicionMayor = i;
			}
	
			i++;
		}
		Pantalla.escribirInt("El número mayor está en la posición ", posicionMayor);
	}

}
