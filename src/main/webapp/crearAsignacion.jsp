<%@ page language ="java" contentType = "text/html; charset=UTF-8 pageEncoding = "UTF-8" %>

<!DOCTYPE html>

<html>
<head>
    <title>Crear Asignacion</title>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
</head>

<body>
    <h1>Crear Asignacion</h1>
    <%@page import = "servlet.*" %>

    <%
        Unico unico = Unico.getInstance();

        int id = Integer.parseInt(request.getParameter("id"));
        int idE = Integer.parseInt(request.getParameter("idEmpleado"));
        int idO = Integer.parseInt(request.getParameter("idProyecto"));
        String horas = request.getParameter("horas");
        String responsabilidades = request.getParameter("responsabilidades");

        Unico u = Unico.crear();
        out.println(" el Unico me devuelve " + u.getContador());  
    %>
</body>
</html>