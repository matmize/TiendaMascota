package servlet;

public class Unico{
    private int contador = 0;
    private static Unico unico = null;
    Empleado e[] = new Empleado[100];
    Proyecto p[] = new Proyecto[100];
    Asignacion a[] = new Asignacion[100];

    public Unico() {

    }

    public static Unico crear(){
        if (unico == null)
            unico = new Unico();
        
        return unico;
    }
    public int getContador(){
        contador++;
        return contador;
    }
}