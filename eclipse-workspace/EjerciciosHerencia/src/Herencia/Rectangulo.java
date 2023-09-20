package Herencia;

public class Rectangulo extends Forma {
	private double ancho;
	private double alto;
	
	public Rectangulo(Color color, double ancho, double alto) {
		super(color);
		this.alto=alto;
		this.ancho=ancho;
		// TODO Auto-generated constructor stub
		
	}

	public double calcularArea() {
		return this.ancho*this.alto;
	}
	
	public double calcularPerimetro() {
		return 2*this.ancho+2*this.alto;
	}
	
}
