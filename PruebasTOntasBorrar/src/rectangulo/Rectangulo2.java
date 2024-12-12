package rectangulo;
import daw.com.Pantalla;
	import daw.com.Teclado;
	
public class Rectangulo2 {

		private int color;
		private Punto centro;
		private double base;
		private double altura;
		
		public Rectangulo2() {
			this.color = 0;
			this.base = 0.0;
			this.altura = 0.0;
			this.centro = new Punto();
		}	
		
		public Rectangulo2(int color, Punto centro, double base, double altura) {
			this.color = color;
			this.centro = centro;
			this.base = base;
			this.altura = altura;
		}

		public Rectangulo2(Rectangulo2 r) {
			this.color = r.color;
			this.base = r.base;
			this.altura = r.altura;
			this.centro = new Punto(r.centro);
		}


		public void mostrarDatos() {
			Pantalla.escribirString("Base del rectángulo: ", String.valueOf(base));
			Pantalla.escribirSaltoLinea();
			Pantalla.escribirString("Altura del rectángulo: ", String.valueOf(altura));
			Pantalla.escribirSaltoLinea();
			Pantalla.escribirString("Color del rectángulo: ", String.valueOf(color));
			Pantalla.escribirSaltoLinea();		
			Pantalla.escribirString("");
			centro.mostrarDatos();
			Pantalla.escribirSaltoLinea();
			Pantalla.escribirSaltoLinea();
		}
		
		/*
		 * Código duplicado
		 * Control de errores
		 * No usa métodos, los redefine
		 * No se ha leído la documentación de Teclado
		 * 
		 * Crear funciones para evitar código duplicado
		 * Modificar leerDatos() para cumplir especificaciones
		 * Usar los métodos adecuados para cada tipo
		 * Buscar un método para realizar conversiones seguras
		 */
		
		public void DatosDouble() {
			// Comprimit esto para una nueva funcion que haga ambas
			do {
					double alturaAnterior = this.altura;
					
					Pantalla.escribirString("Indica el nuevo valor de la altura: ");
					
					String alturaNueva = Teclado.leerString();
					
					if (alturaNueva.equals("")) {
					
						  this.altura = alturaAnterior;
						
					 }else 
					
					if (!alturaNueva.isEmpty()) {
					
						try {
							this.altura = Double.parseDouble(alturaNueva);
						} catch (NumberFormatException e) {
							this.altura = -1;
						}
					}
				} while (this.altura < 0.0);
				
			
			
			do {
				
				Pantalla.escribirString("Indica el nuevo valor de la base: ");
				String baseNueva = Teclado.leerString();

			if (!baseNueva.isEmpty() ) {
				
				try {
					this.base = Double.parseDouble(baseNueva);
				}catch (NumberFormatException e){
					this.base = -1;
				}
				
			}
			
		}while (this.base < 0.0);
		}
		
		public void DatosInt(){
			
			Pantalla.escribirString("Indica el nuevo valor del color: ");
			int colorNuevo = Teclado.leerInt();
			
			if (colorNuevo == 999) {
				this.color =colorNuevo;
			}
		}
		
		
		public void cambiarDatos() {
			DatosDouble();
			DatosInt();
			this.centro.leerDatos();
			
			
			
			
		/*
		 * 	Pantalla.escribirString("Indica el nuevo valor de la X del punto : ");
			int xNueva = Teclado.leerInt();
			if (xNueva == 999 )
				this.centro.setX(xNueva);
			
			
			Pantalla.escribirString("Indica el nuevo valor de la X del punto : ");
			int yNueva = Teclado.leerInt();
			if (yNueva == 999)
				this.centro.setY(yNueva);
		 */
			

			//Double.isNaN(Double.valueOf(alturaNueva));
			
			
		}
		
		
		
		/**
		 * @return the color
		 */
		public int getColor() {
			return color;
		}

		/**
		 * @param color the color to set
		 */
		public void setColor(int color) {
			this.color = color;
		}

		/**
		 * @return the centro
		 */
		public Punto getCentro() {
			return centro;
		}

		/**
		 * @param centro the centro to set
		 */
		public void setCentro(Punto centro) {
			this.centro = centro;
		}

		/**
		 * @return the base
		 */
		public double getBase() {
			return base;
		}

		/**
		 * @param base the base to set
		 */
		public void setBase(double base) {
			this.base = base;
		}

		/**
		 * @return the altura
		 */
		public double getAltura() {
			return altura;
		}

		/**
		 * @param altura the altura to set
		 */
		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		
}
	

