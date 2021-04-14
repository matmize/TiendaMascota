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
    name = "crearProducto",
    urlPatterns = {"/crear"}
)

public class crearProducto extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        Unico unico = Unico.getInstance();

        int codigo = Integer.parseInt(req.getParameter("codigo"));
        String nombre = req.getParameter("nombre");
        String descripcion = req.getParameter("descripcion");
        int valorUni = Integer.parseInt(req.getParameter("valorUni"));
        int cantidad = Integer.parseInt(req.getParameter("cantidad"));
        ServletOutputStream out;

        String rpta = "ya existe un producto con el codigo " + codigo;
        String rpta1 = "Se ha creado un producto con el codigo" + codigo;

        if (unico.buscarProducto(codigo).getCodigo() == -100){
            unico.crearProducto(codigo,nombre, descripcion, valorUni,cantidad);
            out = resp.getOutputStream();
            out.write(rpta1.getBytes());

            

        }else{
            out = resp.getOutputStream();
            out.write(rpta.getBytes());

            
        }
        out.println("<body>");
            out.println("<a class= "boton"  href= "index.html" >Volver</a>");
        out.println ("</body>");
        out.flush();
        out.close();
    }
}


    