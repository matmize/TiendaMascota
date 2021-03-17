<html>
<head>
	
</head>

<body>

    <%@page import= "servlet.*"%>
    <%

    int id = Integer.ParseInt(request.getParameter("id"));
    String nombre = request.getParameter("nombre");
    float presupuesto = Float.ParseFloat(request.getParameter("presupuesto"));
    String tiempo = request.getParameter("Tiempo");
    Unico u = Unico.crear();

    out.println("el unico me devuelve" + u.getContador());
    %>
	
</body>
</html>