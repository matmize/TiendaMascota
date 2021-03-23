package servlet;

import java.util.*;



public class Unico{
    private static Unico INSTANCE = null;
    private ArrayList<Empleado>empleados = new ArrayList();
    private ArrayList<Proyecto>proyectos = new ArrayList();
    private ArrayList<Asignacion>asignaciones = new ArrayList();

    public class Unico getInstance (){
        <%@page import = "servlet.*" %>
        <%@page import = "Empleado" %>
        <%@page import = "Proyecto" %>
        <%@page import = "Asignacion" %>
    }


    public void crearEmpleado (int id, String nombre, String habilidades){
        Empledo empleado = new Empledo (id, nombre, habilidades);
        empleados.add(empleado);
    }

    
}