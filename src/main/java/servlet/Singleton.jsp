package servlet;

public class Unico {
	private int contador = 0;
	private static Unico unico = null;
	private var Empleado = [];
	private var Proyecto = [];
	private var Asignacion = [];


	public Unico(){
	}
	public static todo crear(){
		if (unico == null )
				unico = new Unico
		return unico;
	}

	public int getContador(){
		contador ++;
		return contador;
	}
}