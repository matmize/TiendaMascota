package servlet;

import java.util.*;



public class Unico{

    private static Unico unico= null;
    private static Unico INSTANCE = null;
    private ArrayList<Empleado>empleados = new ArrayList();
    private ArrayList<Proyecto>proyectos = new ArrayList();
    private ArrayList<Asignacion>asignaciones = new ArrayList();
	
	public Unico(){
		
	}
		

    public static Unico getInstance(){
		if (INSTANCE == null){
				INSTANCE = new Unico();
			
		}
    	return INSTANCE;
    }


    public void crearEmpleado (int id, String nombre, String habilidades){
        Empleado empleado = new Empleado (id, nombre, habilidades);
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
            Empleado empleado = new Empleado (-100,"-","-");
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
                                if (Integer.parseInt(emp[k])!= id){
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
                        	if (Integer.parseInt(emp[0])== id){
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
                empleados.get(i).nombreEmpleado = nombre;
                empleados.get(i).habilidades = habilidades;
            }
        }

    }

    public void crearProyecto (int id, String empresa,int presupuesto,String tiempo){
        Proyecto proyecto = new Proyecto (id,empresa,presupuesto,tiempo);
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
                return proyectos.get(locate);
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
            if (proyectos.get(i).idProyecto == id){
                proyectos.remove(i);
            } else{
                Proyecto proyecto = new Proyecto (-100,"-",0,"-");
            }
        }


    }
    public void editarProyecto (int idProyecto, String empresa,int presupuesto,String tiempo){
         for (int i =0; i<proyectos.size();i++){
            if (idProyecto== proyectos.get(i).idProyecto){
                proyectos.get(i).empresa = empresa;
                proyectos.get(i).presupuesto = presupuesto;
                proyectos.get(i).tiempo = tiempo;
            }
        }

    }

    public void crearAsignacion (int id, String idemp, int idProy,int horas,String responsabilidades){
        Asignacion asignacion = new Asignacion (id,idemp,idProy,horas,responsabilidades);
        asignaciones.add(asignacion);
    }

    public Asignacion buscarAsignacion (int id ){
         if (asignaciones.size()>0){
            int count = 0;
            int locate = 0;

            for (int i = 0; i < asignaciones.size();i++){
                if (id == asignaciones.get(i).id ){
                    count++;
                    locate = i;
                }
            }
            if (count == 1 ){
                return asignaciones.get(locate);
            }else{


                Asignacion asignacion = new Asignacion (-100,"-",0,0,"-");
                return asignacion;
            }
        }else{
           Asignacion asignacion = new Asignacion (-100,"-",0,0,"-");
            return asignacion;
        }

    }

    public void eliminarAsignacion (int id, String idemp, int idProy,int tiempo,String responsabilidades){
         for (int i =0; i< asignaciones.size();i++){
            if (asignaciones.get(i).id == id){
                asignaciones.remove(i);
            } else{
                Asignacion asignacion = new Asignacion (-100,"-",0,0,"-");
            }
        }
    }

    public void editarAsignacion (int id, String idemp, int idProy,int horas,String responsabilidades){
        for (int i =0; i<asignaciones.size();i++){
            if (idProy == asignaciones.get(i).idProy){
                asignaciones.get(i).idemp = idemp;
                asignaciones.get(i).horas = horas;
                asignaciones.get(i).responsabilidades = responsabilidades;
            }
        }

    }
    
}