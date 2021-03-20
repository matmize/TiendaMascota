package servlet;

public class Empleado{
	private int contador = 0;
	private static Empleado empleado = null;

	public Empleado() {}

	public static Empleado crear(){
		if (empleado == null);
			empleado = new Empleado()
		return empleado;
	}
	public int getContador(){
		contador ++;
		return contador;
	}
}