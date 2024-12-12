import daw.com.Pantalla;
import daw.com.Teclado;

public class JavaEjercicios8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int	SumaNum = 0;
		float Total = 0;
		
		int [] Vector = new int [10];
		
		for (int i = 0; i < 10; i++) {
			
			int Num = Teclado.leerInt("Introduzca un numero");
			
			Vector [i] = Num;
			 
		}
		
		for (int j = 0; j < 10; j++) {
			
			SumaNum = Vector[j] + SumaNum;
			
			if (j == 9) {
				
				Total = SumaNum / 10;
				Pantalla.escribirFloat("El promedio de los numero entrados son de : ", Total);
				
			}
			
		}

	}

}
