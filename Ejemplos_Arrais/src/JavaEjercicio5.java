import daw.com.Pantalla;

public class JavaEjercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] Vector = new int [10];
		
		Vector [0] = 101;
		Vector [1] = 103;
		Vector [2] = 107;
		Vector [3] = 109;
		Vector [4] = 113;
		Vector [5] = 127;
		Vector [6] = 131;
		Vector [7] = 137;
		Vector [8] = 139 ;
		Vector [9] = 149 ;
		
		for (int i = 0; i < 10; i++) {
			
			Pantalla.escribirInt(Vector[i]);
			Pantalla.escribirSaltoLinea();
			
		}
	}

}
