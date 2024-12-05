package rectangulo;


public class Rectangulo {
	
	private Punto centro;
	private int largo;
	private int ancho;
	private int color;
	
	public Rectangulo() {
		//Rectangolo sin datos introduccidos , rectangulos base
		this.centro = new Punto();
		this.largo = 2;
		this.ancho = 1;
		this.color = 0;
		
	}
	
	public Rectangulo (int largo, int ancho, int color, Punto centro) {
		// constructor con todos los parametros introduccidos
		this.largo = largo;
		this.ancho = ancho;
		this.centro = centro;
		this.color = color;

	}
	
	public Rectangulo (Rectangulo rectangulo) {
		//Esta funcion crea una copia como un nuevo objeto de los datos
		this.largo =rectangulo.largo;
		this.ancho = rectangulo.ancho;
		this.centro = rectangulo.centro;
		this.color = rectangulo.color;
	}
	
	public int getLargo () {
		return largo;
	}
	
	public void setLargo (int largo) {
		this.largo = largo;
	}
	
	public int getAncho () {
		return ancho;
	}
	
	public void setAncho (int ancho) {
		this.ancho = ancho;
	}
	
	
	
	
	
}
