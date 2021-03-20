<html>
<head>
	
</head>

<body>
    <%@page import = "servlet.*" %>

    <%

    int id = Integer.parseInt(request.getParameter("id"));
    int idE = Integer.parseInt(request.getParameter("idEmpleado"));
    int idO = Integer.parseInt(request.getParameter("idProyecto"));
    String horas = request.getParameter("horas");

    Unico u =Unico.crear();
  

    out.println(" el Unico me devuelve " + u.getContador());
    out.println(" el id de la asignacion es " + u.getId() + " y el id del empleado es " + u.getIdE() );
    
    
    
    
    %>
</body>
</html>