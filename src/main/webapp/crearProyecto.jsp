<html>
<head>
	
</head>

<body>

    <h1>Crear Proyecto</h1>
    <%@page import = "servlet.*" %>
    <%@ page import = "java.lang.Math.*" %>

    <%
    Unico unico = Unico.getInstance();

    int id = Math.abs(Integer.parseInt(request.getParameter("id")));
    String nombre = request.getParameter("nombre");
    int presupuesto = Math.abs(Integer.parseInt(request.getParameter("presupuesto")));
    String tiempo = request.getParameter("tiempo");
   

    if ( unico.buscarProyecto(id).idProyecto == -100){
        unico.crearProyecto(id,nombre,presupuesto,tiempo);
       
    }else{%>
        <p>Ya Existe un Proyecto con el id <%= Integer.parseInt(request.getParameter("id"))%></p>

    <%}

%>
<p>Se creo el Proyecto con el ID <%= Math.abs(Integer.parseInt(request.getParameter("id")))%></p>

<a href = "crearProyecto.html"><button  type="button">Volver</button></a><a href = "index.html"><button type = "button" >Menu</button></a>

    
	
</body>
</html>