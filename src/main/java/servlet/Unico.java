package servlet;

import java.util.*;



public class Unico{

    private static Unico unico= null;
    private static Unico INSTANCE = null;
    private ArrayList<Producto>productos = new ArrayList();
   
	
	public Unico(){
		
	}
		

    public static Unico getInstance(){
		if (INSTANCE == null){
				INSTANCE = new Unico();
			
		}
    	return INSTANCE;
    }


    public void crearProducto (int codigo, String nombre,String descripcion,int valorUni,int cantidad){
        Producto producto= new Producto (codigo, nombre, descripcion, valorUni,cantidad);
        productos.add(producto);
       
    }
    public Producto buscarProducto (int codigo){
        if (productos.size()>0){
            int count = 0;
            int locate = 0;

            for  (int i = 0; i < productos.size();i++){
                if (codigo== productos.get(i).getCodigo()){
                    count++;
                    locate = i;
                }
            }
            if (count == 1 ){
                return productos.get(locate);
            }else{
                Producto producto = new Producto (-100,"-","-",0,0);
                return producto;
            }
        }else{
            Producto producto = new Producto (-100,"-","-",0,0);
            return producto;
        }
    }

   public void eliminarProducto (int codigo){
        for (int i =0; i< productos.size(); i++){
            if (productos.get(i).getCodigo() == codigo){
                productos.remove(i);
            } else{
                Producto productos = new Producto (-100,"-","-",0,0);
            }
        }


    }

    public void editarProducto(int codigo, String nombre,String descripcion,int valorUni,int cantidad){
        for (int i =0; i<productos.size();i++){
            if (codigo == productos.get(i).getCodigo()){
                empleados.get(i).nombreEmpleado = nombre;
                empleados.get(i).habilidades = habilidades;
            }
        }

    }
}