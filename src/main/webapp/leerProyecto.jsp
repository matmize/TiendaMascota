<html>
<head>
    <h1>Leer Proyecto</h1>
	<meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
</head>

<body>

    
    <%@ page import = "servlet.*" %>
    <%@ page import = "java.lang.Math.*" %>
 
    <%
         Unico unico = Unico.getInstance();
 
         int id = Math.abs(Integer.parseInt(request.getParameter("id")));
         
 
         if (unico.buscarProyecto(id).idProyecto == -100){%>
             <p>No existe el Proyecto con ID<%= Integer.parseInt(request.getParameter("id"))%></p>
         <%}else{%>
             <Table>
                 <tr><td><Strong>ID Proyecto : </Strong></td> <tr><td><Strong><%= unico.buscarProyecto(id).idProyecto%> </Strong></td>
                 <tr><td><Strong>Nombre Proyecto : </Strong></td><tr><td><Strong><%= unico.buscarProyecto(id).empresa%> </Strong></td>
                 <tr><td><Strong>Presupuesto Proyecto : </Strong></td><tr><td><Strong><%= unico.buscarProyecto(id).presupuesto%> </Strong></td> 
                 <tr><td><Strong>Tiempo Proyecto : </Strong></td><tr><td><Strong><%= unico.buscarProyecto(id).tiempo%> </Strong></td>
                 


             </Table>
 
         <%}
     
     %>

     <a href = "leerProyecto.html"><button  type="button">Volver</button></a><a href = "index.html"><button type = "button" >Menu</button></a>
     
 
	
</body>
</html>