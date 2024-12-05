import daw.com.Pantalla;
import daw.com.Teclado;

public class JavaEjercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Vector [] = new int [10];
		
		for (int i = 0; i < 10; i ++) {
			
			int Num =  Teclado.leerInt("Escribe el numero: ");
			Vector [i] = Num;
			
			for (int j = 0; j < 10; j++ ) {
				
				if (Vector [j] % 10 == 4) {
				Pantalla.escribirInt("Este numero si termina en 4 y esta en la posicion ", i);

				}
			}
			
			
			
		}

	}

}
