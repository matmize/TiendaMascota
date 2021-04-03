package servlet;

public class Asignacion {
	public String idemp;
	public int idProy;
	public int horas;
	public String responsabilidades;

	public Asignacion(String idEmpleado, int idProyecto,int horas,String responsabilidades){
		this.idemp = idEmpleado;
		this.idProy= idProyecto;
		this.horas = horas;
		this.responsabilidades = responsabilidades;
	}


    public String getIdemp() {
        return idemp;
    }

    public void setIdemp(String idemp) {
        this.idemp = idemp;
    }

    public int getIdProy() {
        return idProy;
    }

    public void setIdProy(int idProy) {
        this.idProy = idProy;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(String responsabilidades) {
        this.responsabilidades = responsabilidades;
    }
	
}
