package Herencia;

public class Main {

	public static void main(String[] args) {
		Circulo circulo=new Circulo(Color.AZUL, 5.6);
		Rectangulo rectangulo=new Rectangulo(Color.VERDE, 4.56, 7.89);
		
		System.out.println(circulo.calcularPerimetro());
		System.out.println(circulo.calcularArea());
		
		System.out.println(rectangulo.calcularArea());
		System.out.println(rectangulo.calcularPerimetro());
		
		circulo.mostrarColor();
		rectangulo.mostrarColor();
		
		System.out.println(circulo.isRelleno());
	}
}
