package servlet;

public class Asignacion {
	public String idemp;
	public int idProy;
	public int horas;
	public String duty;

	public Asignacion(String idEmpleado,int idProyecto,int tiempo,String responsabilidades){
		this.idemp = idEmpleado;
		this.idProy= idProyecto;
		this.worktime = tiempo;
		this.duty = responsabilidades;
	}
	
}