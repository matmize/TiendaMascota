package servlet;

public class Unico{
    private int contador = 0;
    private static Unico unico = null;
    ArrayList<Empleado> empleados = new ArrayList<>();
    ArrayList<Proyecto> proyectos = new ArrayList<>();
    ArrayList<Asignacion> asignaciones = new ArrayList<>();

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