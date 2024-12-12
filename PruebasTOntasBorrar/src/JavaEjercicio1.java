import daw.com.Pantalla;

public class JavaEjercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float [][] matriz = new float [4] [4];
		
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < 4; j++) {
				if (i == j) {
					matriz[i][j] = (float) 1.0; 
					Pantalla.escribirFloat(matriz [i][j]);	
				
				}else {
						Pantalla.escribirFloat(matriz [i][j]);
				}
			}
			
			
		}
	
	}

}
