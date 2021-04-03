<html>
<head>
	
</head>

<body>

   <h1>Crear Asignacion</h1>
   <%@ page import = "servlet.*" %>
   <%@ page import = "java.lang.Math.*" %>

   <%
        Unico unico = Unico.getInstance();

        int idEmpleado = Math.abs(Integer.parseInt(request.getParameter("idEmpleado")));
        int idProyecto = Math.abs(Integer.parseInt(request.getParameter("idProyecto")));
        String horas = request.getParameter("horas");
        String responsabilidades = request.getParameter("responsabilidades");
        
        if (unico.buscarAsignacion(idProyecto).idProy == -100){
            unico.crearAsignacion(id,idemp,idProyecto,horas,responsabilidades);
            
        }else{%>
            <p>Ya Existe una asignacion con el id <%= Integer.parseInt(request.getParameter("id"))%></p>

        <%}
    
    %>
    <p>Se creo la Asignacion con el ID <%= Math.abs(Integer.parseInt(request.getParameter("id")))%></p>

    <a href = "crearAsignacion.html"><button  type="button">Volver</button></a><a href = "index.html"><button type = "button" >Menu</button></a>
	
</body>
</html>