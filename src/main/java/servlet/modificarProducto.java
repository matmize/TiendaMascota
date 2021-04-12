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

        int codigo = Integer.parseInt(req.getParameter("codigo1"));
        String nombre = req.getParameter("nombre1");
        String descripcion = req.getParameter("descripcion1");
        int valorUni = Integer.parseInt(req.getParameter("valorUni1"));
        int cantidad = Integer.parseInt(req.getParameter("cantidad1"));

        String rpta = "No existe un producto con el codigo " + codigo;
        String rpta1 = "Se ha editado el producto con el codigo" + codigo;

        if (unico.buscarProducto(codigo).getCodigo() == -100){
            unico.editarProducto(codigo,nombre,descripcion,valorUni,cantidad);
            ServletOutputStream out = resp.getOutputStream();
            out.write(rpta1.getBytes());

            out.flush();
            out.close();

        }else{
            ServletOutputStream out = resp.getOutputStream();
            out.write(rpta.getBytes());

            out.flush();
            out.close();
        }

        


    }


}


    

    