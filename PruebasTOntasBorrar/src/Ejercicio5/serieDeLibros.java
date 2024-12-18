package Ejercicio5;

public class serieDeLibros {

	//Seria modificar el ejercicio 6 pero en vez de colores, nombres de libros...
	
class Libros {
	private String libro;
	private Libros siguiente;

	public Libros (String libro) {
		this.libro = libro;
	}
	public void poner(Libros siguiente_libro) {
		siguiente = siguiente_libro;
}
	public Libros coger() {
		return siguiente;
		}
	public String libro() {
		return libro;
		}
	}
}

class ListaDeLibros {
	private Nodo primero;
	
	public void Lista() {
		primero = null;
	}
	
	public void imprimir() {
		for( Nodo aux=primero; aux.coger()!= null;aux = aux.coger()) {
			System.out.print(aux.color()+ (""));
			 }
	}
	
	public void incluir(String cadena) {
		Nodo elemento = new Nodo(cadena);
		if (primero==null) {
		primero=elemento;

		}
		else {
		Nodo aux;
		for (aux=primero;aux.coger()!= null;aux=aux.coger());
		aux.poner(elemento);
		}
	}
		
}
