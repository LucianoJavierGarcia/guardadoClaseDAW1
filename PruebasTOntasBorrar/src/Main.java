import daw.com.Pantalla; 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un vector de tipo cadena (String) que almacene 10 elementos;
		//Déspues, imprimir la palabra ejemplo y lo que contenga cada elemnto.
		String [] vector  = new String[10]  ;
		
		
		
		vector = new String [10]; //Aqui abra 10 REFERENCIAS de donde estaran los caracteres
		for (int i = 0; i < 10; i++) { //Aqui pone,un inicializado de una variable i = 0, que se ejecutara si i es menor que 10 y que cada vez que finalize se le añada +1 a la variable
		
			vector[i] = "Patata Nº" + i*10;
			
			Pantalla.escribirString("ejemplo" + vector[i]);
			Pantalla.escribirSaltoLinea();
			
			
			
		}
		
		int [][] matriz = new int [2][3];
		System.out.println(matriz);
		for (int i = 0; i < 2; i++) {
			
		}
		
	}

}
