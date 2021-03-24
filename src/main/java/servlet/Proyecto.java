package servlet;

public class Proyecto{
	
	private int idProyecto;
	private String empresa;
	private int presupuesto;
	private String tiempo;

	public Proyecto (int idProyecto, String empresa, int presupuesto, String tiempo) {

		this.idProyecto = idProyecto;
		this.empresa = empresa;
		this.presupuesto = presupuesto;
		this.tiempo = tiempo;
	}

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
        
        
}