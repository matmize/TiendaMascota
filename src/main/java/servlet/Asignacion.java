package servlet;

public class Asignacion {
	private int contador = 0;
	private static Asignacion asignacion = null;


	public Asignacion(){}

	public static Asignacion crear(){
		if (asignacion == null);
			asignacion = new Asignacion()
			return asignacion;
	}
	public int getContador(){
		contador ++;
		return contador;
	}
}