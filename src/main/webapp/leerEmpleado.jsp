
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
    
            if (unico.buscarEmpleado(id).idEmpleado == -100){
                <p>No existe el empleado con ID<%= Integer.parseInt(request.getParameter("id"))%></p>
            }else{%>
                <Table>
                    <tr><td><Strong>ID Empleados</Strong></td><tr><td><Strong>Nombre Empleado</Strong></td><tr><td><Strong>Habilidad Empleado</Strong></td>
                    <tr><td><Strong><% unico.buscarEmpleado(id).idEmpleado%> </Strong></td><tr><td><Strong><% unico.buscarEmpleado(id).nombreEmpleado%> </Strong></td><tr><td><Strong><% unico.buscarEmpleado(id).habilidadEmpleado%> </Strong></td>


                </Table>
    
            <%}
        
        %>
        
    
        <a href = "crearEmpleado.html"><button  type="button">Volver</button></a><a href = "index.html"><button type = "button" >Menu</button></a>
        
    </body>
    </html>