package clases_abstractas;

public class EmpleadoPorHora extends Empleado {
	private int horasTabajadas;
	private final int salarioHoras;
	public EmpleadoPorHora(String nombreString, int edad, double salarioBase, int horasTrabajadas, int salarioHoras) {
		super(nombreString, edad, salarioBase);
		this.salarioHoras=salarioHoras;
		this.horasTabajadas=horasTrabajadas;
	}

	public int getHorasTabajadas() {
		return horasTabajadas;
	}
	
	@Override
	public double calcularSalario() {
		return this.horasTabajadas*this.salarioHoras;
	}

	
}
