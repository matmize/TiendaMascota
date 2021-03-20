<html>
<head>
	
</head>

<body>
    <%@page import = "servlet.html" %>

    <%

    int id = Integer.parseInt(request.getParameter("id"));
    int idE = Integer.parseInt(request.getParameter("idEmpleado"));
    int idO = Integer.parseInt(request.getParameter("idProyecto"));
    String horas = request.getParameter("horas");

    Unico u =Unico.crear();
    Asignacion a =Asignacion.crear();

    out.println("el Unico me devuelve" + u.getContador());
    
    
    
    
    %>
</body>
</html>