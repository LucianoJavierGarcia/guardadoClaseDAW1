import daw.com.Pantalla;
import daw.com.Teclado;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int[] vector = new int [10];
		int posicionMayor = 0;
		
		while (i < 10 ) {
			vector[i] = Teclado.leerInt("Escribe un numero " + (i+1) + ": ");
			i++;
			if (vector[i] > vector[posicionMayor]) {
			posicionMayor = i;
			}
	
			i++;
		}
		Pantalla.escribirInt("El número mayor está en la posición ", posicionMayor);
		
	}

}
