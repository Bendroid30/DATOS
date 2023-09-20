package clases_abstractas;

public abstract class Empleado { 
	protected String nombreString;
	protected int edad;
	protected double salarioBase;
	
	public Empleado(String nombreString, int edad, double salarioBase){
		this.nombreString=nombreString;
		this.edad=edad;
		this.salarioBase=salarioBase;
		
	}
	
	public abstract double calcularSalario();

	@Override
	public String toString() {
		return "Empleado [nombreString=" + nombreString + ", calcularSalario()=" + calcularSalario() + "]";
	}

	
}

