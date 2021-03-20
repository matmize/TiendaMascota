package servlet;

public class Unico{
    private int contador = 0;
    private static Unico unico = null;
    Empleado e [] = new Empleado[];
    Proyecto p [] = new Proyecto[];
    Asignacion a[] = new Asignacion[];

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