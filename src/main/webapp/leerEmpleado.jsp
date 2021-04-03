
<html>
    <head>
        
    </head>
    
    <body>
    
       <h1>Leer Empleado</h1>
       <%@ page import = "servlet.*" %>
       <%@ page import = "java.lang.Math.*" %>
    
       <%
            Unico unico = Unico.getInstance();
    
            int id = Math.abs(Integer.parseInt(request.getParameter("id")));
    
            if (unico.buscarEmpleado(id).idEmpleado == -100){%>
                <p>No existe el empleado con ID<%= Integer.parseInt(request.getParameter("id"))%></p>
            <%}else{%>
                <Table>
                    <tr><td><Strong>ID Empleado : </Strong></td> <Strong><%= unico.buscarEmpleado(id).idEmpleado%> </Strong>
                    <tr><td><Strong>Nombre Empleado : </Strong></td><Strong><%= unico.buscarEmpleado(id).nombreEmpleado%> </Strong>
                    <tr><td><Strong>Habilidad Empleado : </Strong></td><Strong><%= unico.buscarEmpleado(id).habilidades%> </Strong>
                    


                </Table>
    
            <%}
        
        %>
        
    
        <a href = "crearEmpleado.html"><button  type="button">Volver</button></a><a href = "index.html"><button type = "button" >Menu</button></a>
        
    </body>
    </html>