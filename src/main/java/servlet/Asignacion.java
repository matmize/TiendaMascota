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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
