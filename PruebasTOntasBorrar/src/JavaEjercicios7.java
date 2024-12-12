import daw.com.Pantalla;
import daw.com.Teclado;

public class JavaEjercicios7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Vector [] = new int [10]; 
		int NumMAX = 0;
		int j = 0;
		
		for (int i = 0; i < 10; i ++) {
			
			int Num =  Teclado.leerInt("Escribe el numero: ");
			Vector [i] = Num;
			
			if (Num >= NumMAX) {
				
				NumMAX = Vector[i];
				j += 1; 
				
			}
			
			
		}
		
		Pantalla.escribirInt("El numero mas alto a sido: ", NumMAX);
		Pantalla.escribirInt(" Y se a repetido este nuemro de veces: ", j);
		
	}

}
