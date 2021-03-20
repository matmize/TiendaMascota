package servlet;

public class Proyecto{
	private int contador = 0;
	private static Proyecto proyecto = null;

	public Proyecto() {}

	public static Proyecto crear(){

		if (proyecto == null);
			proyecto = new Proyecto()
		return proyecto;
	}

	public int getContador(){
		contador ++;
		return contador;
	}

}