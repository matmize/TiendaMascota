<!DOCTYPE html>

<html>
<head>
    <title>Eliminar Asignacion</title>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
</head>

<body>
    
    <h1>Eliminar Asignacion</h1>
    <%@page import = "servlet.*" %>
    <%@ page import = "java.lang.Math.*" %>

    
    <%
        Unico unico = Unico.getInstance();

        int id = Math.abs(Integer.parseInt(request.getParameter("id")));


        if (unico.buscarAsignacion(id).idProy!=-100){

            unico.eliminarAsignacion(idProy); %>

            <p>Se elimino la asignacion</p>
        <%}else{%>

            <p>No existe la asignacion del proyecto con ID <%= Math.abs(Integer.parseInt(request.getParameter("idProy")))%></p>

        <%}
    %>

    <a href = "eliminarAsignacion.html"><button  type="button">Volver</button></a><a href = "index.html"><button type = "button" >Menu</button></a>
</body>
</html>