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

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }
        
        

	


}
