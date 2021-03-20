<html>
<head>
	
</head>

<body>
    <%@page import = "servlet.*" %>

    <%

    int id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("nombre");
    int presupuesto = Integer.parseInt(request.getParameter("presupuesto"));
    String tiempo = request.getParameter("tiempo");

    Unico u = Unico.crear();
   

    out.println("el nombre del empleado que contrato es : " + u.getNombre() );
  
    
    
    
    
    %>

    
	
</body>
</html>