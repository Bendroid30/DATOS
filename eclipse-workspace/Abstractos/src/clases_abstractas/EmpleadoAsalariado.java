package clases_abstractas;

public class EmpleadoAsalariado extends Empleado {

	private int numPagas;
	public EmpleadoAsalariado(String nombreString, int edad, double salarioBase, int numPagas) {
		super(nombreString, edad, salarioBase);
		this.numPagas=numPagas;
	}

	@Override
	public double calcularSalario() {
		return (this.salarioBase*12)/this.numPagas;
	}

	public int getNumPagas() {
		return numPagas;
	}

	

}
