package servlet;

public class Empleado{

	private int idEmpleado;
	private String nombreEmpleado;
	private String habilidades;

	public Empleado(int idEmpleado, String nombreEmpleado, String habilidades){
		this.idEmpleado = idEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.habilidades = habilidades;
	}
}