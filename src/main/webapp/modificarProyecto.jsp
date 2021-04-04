<html>
<head>
	
</head>

<body>
    <h1>Modificar Proyecto</h1>

    <%@ page import = "servlet.*" %>
   <%@ page import = "java.lang.Math.*" %>

   <%
        Unico unico = Unico.getInstance();

        int id = Math.abs(Integer.parseInt(request.getParameter("id")));
        String empresa= request.getParameter("empresa");
        int presupuesto = Math.abs(Integer.parseInt(request.getParameter("presupuesto")));
        String tiempo = request.getParameter("tiempo");
        

        if (unico.Proyecto(id).idProyecto == -100){
           
            unico.editarProyecto(id,empresa,presupuesto,tiempo);

        }
    
    %>

    <p>Se modifico el proyecto con el ID <%= Math.abs(Integer.parseInt(request.getParameter("id")))%></p>

    <a href = "modificarProyecto.html"><button  type="button">Volver</button></a><a href = "index.html"><button type = "button" >Menu</button></a>
	


	
</body>
</html>