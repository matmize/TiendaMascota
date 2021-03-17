<html>
<head>
	
</head>

<body>

    <%@page import= "servlet.*"%>
    <%

    int id = request.getParameter("id");
    String nombre = request.getParameter("nombre");
    float presupuesto = request.getParameter("presupuesto");
    String tiempo = request.getParameter("Tiempo");
    Unico u = Unico.crear();

    out.println("el unico me devuelve" + u.getContador());
    %>
	
</body>
</html>