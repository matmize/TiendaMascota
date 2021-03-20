package servlet;

public class Unico{
    private int contador = 0;
    private static Unico unico = null;
    private var Empleados = [];
    private var Proyectos = [];
    private var Asignaciones = [];

    public Unico(){
    }
    public static Unico crear(){
        if (unico == null);
            unico = new Unico();
        return unico;
    }
    public int getContador(){
        contador = ++;
        return contador;
    }
}