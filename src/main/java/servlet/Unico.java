package servlet;

import java.util.*;



public class Unico{
    private static Unico INSTANCE = null;
    private ArrayList<Empleado>empleados = new ArrayList();
    private ArrayList<Proyecto>proyectos = new ArrayList();
    private ArrayList<Asignacion>asignaciones = new ArrayList();
	
	public Unico(){
		
	}
		

    public static Unico crear(){
		if (unico == null){
				unico = new Unico();
			
		}
    	return todo;
    }


    public void crearEmpleado (int id, String nombre, String habilidades){
        Empledo empleado = new Empledo (id, nombre, habilidades);
        empleados.add(empleado);
    }
    public Empleado buscarEmpleado (int id){
        if (empleados.size()>0){
            int count = 0;
            int locate = 0;

            for  (int i = 0; i < empleados.size();i++){
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
                        	if (Integer.ParseInt(emp[0]==id)){
                            	asignaciones.remove(j);
                            	j=0;
                            }
                        }
                    }
                }
            }
        }
    }

    public void editarEmpleado(int id, String nombre, String habilidades){
        for (int i =0; i<empleados.size();i++){
            if (id == empleados.get(i).idEmpleado){
                empleados.get(i).nombre = nombre;
                empleados.get(i).habilidades = habilidades;
            }
        }

    }

    public void crearProyecto (int id, String empresa,int presupuesto,String tiempo){
        Proyecto proyecto = new Proyecto (id,nombre,presupuesto,tiempo);
        proyectos.add(proyecto);
    }
    public Proyecto buscarProyecto (int id ){
        if (proyectos.size()>0){
            int count = 0;
            int locate = 0;

            for  (int i = 0; i < proyectos.size();i++){
                if (id == proyectos.get(i).idProyecto){
                    count++;
                    locate = i;
                }
            }
            if (count == 1 ){
                return proyecto.get(locate);
            }else{
                Proyecto proyecto= new Proyecto (-100,"-",0,"-");
                return proyecto;
            }
        }else{
            Proyecto proyecto= new Proyecto (-100,"-",0,"-");
            return proyecto;
        }
    }

    public void eliminarProyecto (int id){
        for (int i =0; i< proyectos.size();i++){
            if (proyecto.get(i).idProyecto == id){
                proyectos.remove(i);
            } else{
                Proyecto proyectos = new Proyecto (-100,"-",0,"-");
            }
        }


    }
    public void editarProyecto (int id, String empresa,int presupuesto,String tiempo){
         for (int i =0; i<proyectos.size();i++){
            if (id== proyectos.get(i).idProyecto){
                asignaciones.get(i).empresa = empresa;
                asignaciones.get(i).presupuesto = presupuesto;
                asignaciones.get(i).tiempo = tiempo;
            }
        }

    }

    public void crearAsignacion (int idEmpleado, int idProyecto,int tiempo,String responsabilidades){
        Asignacion asignacion = new Asignacion (idEmpleado,idProyecto,tiempo,responsabilidades);
        asignaciones.add(asignacion);
    }

    public Asignacion buscarAsignacion (int id ){
         if (asignaciones.size()>0){
            int count = 0;
            int locate = 0;

            for (int i = 0; i < asignaciones.size();i++){
                if (id == asignacion.get(i).idAsignacion ){
                    count++;
                    locate = i;
                }
            }
            if (count == 1 ){
                return asignacion.get(locate);
            }else{
                Asignacion asignacion= new Asignacion (-100,"-",0,"-","-");
                return asignacion;
            }
        }else{
            Asignacion asignacion= new Asignacion (-100,"-",0,"-","-");
            return asignacion;
        }

    }

    public void eliminarAsignacion (int id, String idEmpleado, int idProyecto,int tiempo,String responsabilidades){
         for (int i =0; i< asiganciones.size();i++){
            if (asigancion.get(i).idAsignacion == id){
                asiganciones.remove(i);
            } else{
                Asignacion asignaciones = new Asignacion (-100,"-",0,"-");
            }
        }
    }

    public void editarAsignacion (int id, String idEmpleado, int idProyecto,int tiempo,String responsabilidades){
        for (int i =0; i<asignaciones.size();i++){
            if (idProyecto == asignaciones.get(i).idProyecto){
                asignaciones.get(i).idemp = idEmpleado;
                asignaciones.get(i).worktime = tiempo;
                asignaciones.get(i).duty = responsabilidades;
            }
        }

    }
    
}