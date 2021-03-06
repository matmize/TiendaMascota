package servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.Math;

@WebServlet(
    name = "modificarProducto",
    urlPatterns = {"/modificar"}
)

public class modificarProducto extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        Unico unico = Unico.getInstance();

        int codigo = Integer.parseInt(req.getParameter("codigo"));
        String nombre1 = req.getParameter("nombre1");
        String descripcion1 = req.getParameter("descripcion1");
        int valorUni1 = Integer.parseInt(req.getParameter("valorUni1"));
        int cantidad1= Integer.parseInt(req.getParameter("cantidad1"));

        String rpta = "No existe un producto con el codigo " + codigo;
        String rpta1 = "Se ha editado el producto con el codigo" + codigo;
        ServletOutputStream out;


        if (unico.buscarProducto(codigo).getCodigo() != -100){
            unico.editarProducto(codigo,nombre1,descripcion1,valorUni1,cantidad1);
            out = resp.getOutputStream();
            out.write(rpta1.getBytes());

            

        }else{
            out = resp.getOutputStream();
            out.write(rpta.getBytes());

           
        }

        
        out.flush();
        out.close();

    }


}


    

    