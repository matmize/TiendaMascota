package servlet;

public class Proyecto{
	
	int idProyecto;
	String empresa;
	int presupuesto;
	String tiempo;

	public Proyecto (int idProyecto, String empresa, int presupuesto, String tiempo) {

		this.idProyecto = idProyecto;
		this.empresa = empresa;
		this.presupuesto = presupuesto;
		this.tiempo = tiempo;
	}
}