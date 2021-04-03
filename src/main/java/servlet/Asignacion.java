package servlet;

public class Asignacion {
	public int id;
	public int idemp;
	public int idProy;
	public int horas;
	public String responsabilidades;

	public Asignacion(int id,int idemp,int idProy,int horas,String responsabilidades){
		this.id = id;
		this.idemp = idemp;
		this.idProy= idProy;
		this.horas = horas;
		this.responsabilidades = responsabilidades;
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdemp() {
        return idemp;
    }

    public void setIdemp(int idemp) {
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
