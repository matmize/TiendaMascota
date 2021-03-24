package servlet;

public class Asignacion {
	public int id;
	public String idemp;
	public int idProy;
	public int horas;
	public String duty;

	public Asignacion(int id,String idEmpleado,int idProyecto,int tiempo,String responsabilidades){
		this.idAsignacion = id;
		this.idemp = idEmpleado;
		this.idProy= idProyecto;
		this.worktime = tiempo;
		this.duty = responsabilidades;
	}
	
}