package Herencia;

public class Circulo extends Forma {
	private double radio;
	
	public Circulo(Color color ,double radio){
		super(color);
		this.radio=radio;
		// TODO Auto-generated constructor stub
	}
	
	public double calcularArea() {
		return Math.PI*this.radio*this.radio;
	}
	
	public double calcularPerimetro() {
		return 2*Math.PI*this.radio;
	}


}
