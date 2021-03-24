package servlet;

public class Asignacion {
	private int id;
	private String idemp;
	private int idProy;
	private int horas;
	private String responsabilidades;

	public Asignacion(int id,String idemp,int idProy,int horas,String responsabilidades){
		this.id = id;
		this.idemp = idemp;
		this.idProy= idProy;
		this.horas = horas;
		this.responsabilidades = responsabilidades;
	}
	
}