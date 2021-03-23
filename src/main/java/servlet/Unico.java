package servlet;

import java.util.*;

public class Unico{
    private static Unico INSTANCE = null;
    private ArrayList<Empleado>empleados = new ArrayList();
    private ArrayList<Proyecto>proyectos = new ArrayList();
    private ArrayList<Asignacion>asignaciones = new ArrayList();

    private Unico (){}

    public void creatEmpleado (ind id, String nombre, String habilidades){
        Empledo empleado = new Empledo (id, nombre, habilidades);
        empleados.add(empleado);
    }

    public buscarEmpleado (int id){
        if (empleados.size()>0){
            int count = 0;
            int locate = 0;

            for int (i = 0; i < empleados.size();i++){
                if (id == empleados.get(i).idEmpleado){
                    count++;
                    locate = i;
                }
            }
            if (count == 1 ){
                return empleados.get(locate);
            }else{
                Empleado empleado = new Empleado (-100,"-","-");
                return empleado;
            }
        }else{
            Empleado empleado = new Empleado (-100,"-",'-');
            return empleado;
        }
    }

    public void eliminarEmpleado(int id){
        for (int i =0; i< empleados.size();i++){
            if (empleados.get(i).idEmpleado == id){
                empleados.remove(i);
                if (asignaciones.size()>0){
                    int j = 0;
                    while (j<asignaciones.size()){
                        String [] emp = asignaciones.get(j).idemp.split(",");
                        if (emp.length>1){
                            String nemp ="";
                            for (int k = 0; k<emp.length;k++){
                                if (Integer.ParseInt(emp[k])!= id){
                                    if (k== emp.length-1){
                                        nemp = nemp+emp[k];
                                    }else{
                                        nemp = nemp + emp[k]+",";
                                    }
                                }
                            }
                            asignaciones.get(j).idemp = nemp;
                            j++;
                    }else {
                        if (Integer.ParseInt()emp[0]==id){
                            asignaciones.remove(j);
                            j=0;
                        }
                    }
                }
            }
        }
    }
}