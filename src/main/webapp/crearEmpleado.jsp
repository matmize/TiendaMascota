<html>
<head>
	
</head>

<body>

    <%@page import = "servlet.*" %>

    <%

    int id = Integer.parseInt(request.getParameter("id"));
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String habilidad = request.getParameter("habilidad");

    Unico u =Unico.crear();

    out.println("el nombre del empleado que contrato es :   " + u.getNomre());
  
    
    
    
    
    %>
	
</body>
</html>