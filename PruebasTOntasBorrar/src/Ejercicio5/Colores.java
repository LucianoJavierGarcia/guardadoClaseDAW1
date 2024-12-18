package Ejercicio5;

/*
 * Buscar video de cadenas y nodos  en Java
 * buscar mas algoridmos de estrucuta de datos
 * 
 */

class Colores {
public static void main(String [] args) {
	Lista colores = new Lista();
	colores.incluir("rojo");
	colores.incluir("azul");
	colores.incluir("verde");
	colores.imprimir();
	}
} // Fin clase principal

class Nodo {
private String color;
private Nodo siguiente;
public Nodo(String color) {
this.color=color;
}

public void poner(Nodo siguiente_nodo) {
siguiente=siguiente_nodo;
}

public Nodo coger() {
return siguiente;
}

public String color() {
return color;
}

} // Fin clase Nodo

class Lista {
private Nodo primero;

public Lista() {
primero=null;
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
} // Fin clase Lista



