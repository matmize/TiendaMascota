<!DOCTYPE html>

<html>
<head>
    <title>Eliminar Proyecto</title>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
</head>

<body>
    
    <h1>Eliminar Proyecto</h1>
    <%@page import = "servlet.*" %>
    <%@ page import = "java.lang.Math.*" %>
    <%
        Unico unico = Unico.getInstance();


        int id = Math.abs(Integer.parseInt(request.getParameter("id")));

        
        if (unico.buscarProyecto(id).idProyecto != -100) {
            unico.eliminarProyecto(id);%>

            <p>Se elimino correctamente el proyecto</p>
        <%}else{%>

            <p>No existe el Proyecto con ID <%= Math.abs(Integer.parseInt(request.getParameter("id")))%></p>

        <%}
    %>
    <a href = "eliminarEmpleado.html"><button  type="button">Volver</button></a><a href = "index.html"><button type = "button" >Menu</button></a>
</body>
</html>