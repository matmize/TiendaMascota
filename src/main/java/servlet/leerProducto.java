package servlet;
import java.io.IOException;

import servlet.Producto;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.Math;

@WebServlet(
    name = "leeProducto",
    urlPatterns = {"/leer"}
)

public class leerProducto extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        Unico unico = Unico.getInstance();

        int codigo = Integer.parseInt(req.getParameter(("codigo")));
        

        String rpta = "NO existe un producto con el codigo " + codigo;
        String rpta1 = "";

        if (unico.buscarProducto(codigo).getCodigo() == -100){
            ServletOutputStream out = resp.getOutputStream();
            out.write(rpta.getBytes());

            out.flush();
            out.close();

        }else{
            
            rpta1 = "Codigo : " + unico.buscarProducto(codigo).getcodigo + "Nombre : " + unico.buscarProducto(codigo).getnombre + 
            "Descripcion : " + unico.buscarProducto(codigo).getdescripcion + "Valor por Unidad : " + unico.buscarProducto(codigo).getvalorUni
            + "Cantidad : " + unico.buscarProducto(codigo).getcantidad;


            ServletOutputStream out = resp.getOutputStream();
            out.write(rpta1.getBytes());

            out.flush();
            out.close();
        }

    }


}


    