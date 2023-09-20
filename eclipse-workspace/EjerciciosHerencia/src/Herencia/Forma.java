package Herencia;

public abstract class Forma {
	protected Color color;
	protected boolean relleno;
	
	public Forma(Color color) {
		super();
		this.color = color;
		this.relleno=false;
	}
	
	public void mostrarColor() {
		System.out.println(this.color);
	}

	public boolean isRelleno() {
		return relleno;
	}

	public abstract double calcularPerimetro();
	public abstract double calcularArea();
	
	

}
