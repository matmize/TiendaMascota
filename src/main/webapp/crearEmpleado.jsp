<html>
<head>
	
</head>

<body>

    <%@page import = "servlet.html" %>

    <%

    int id = Integer.parseInt(request.getParameter("id"));
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String habilidad = request.getParameter("habilidad");

    Unico u =Unico.crear();
    Empleado e =Empleado.crear();

    out.println("el Unico me devuelve" + u.getContador());
    
    
    
    
    %>
	
</body>
</html>