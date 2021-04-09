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

public class Producto extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        Unico unico = Unico.getInstance();

        int codigo = Intger.parseInt(req.getParameter("codigo"));
        String nombre = req.getParameter("nombre");
        String descripcion = req.getParameter("descripcion");
        int valorUni = Intger.parseInt(req.getParameter("valorUni"));
        int cantidad = Intger.parseInt(req.getParameter("cantidad"));

        String rpta = "ya existe un producto con el codigo " + codigo;
        String rpta1 = "Se ha creado un producto con el codigo" + codigo;

        if (unico.buscarProducto(codigo).getCodigo() == -100){
            unico.crearProducto(codigo,nombre, descripcion, valorUni,cantidad);
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


    