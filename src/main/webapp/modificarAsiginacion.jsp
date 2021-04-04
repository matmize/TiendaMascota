<html>
<head>
	
</head>

<body>
    <h1>Modificar Asignacion</h1>

    <%@ page import = "servlet.*" %>
   <%@ page import = "java.lang.Math.*" %>

   <%
        Unico unico = Unico.getInstance();

        String idEmpleado = request.getParameter("idEmpleado");
        int idProyecto = Math.abs(Integer.parseInt(request.getParameter("idProyecto")));
        int horas = Math.abs(Integer.parseInt(request.getParameter("horas")));
        String responsabilidades = request.getParameter("responsabilidades");
        

        if (unico.buscarAsignacion(idProyecto).idProy == -100){
           
            unico.editarAsignacion(idEmpleado,idProyecto,horas,responsabilidades)

        }
    
    %>

    <p>Se modifico la Asignacion asosiada al proyecto con el ID <%= Math.abs(Integer.parseInt(request.getParameter("id")))%></p>

    <a href = "modificarAsignacion.html"><button  type="button">Volver</button></a><a href = "index href = "index.html"><button type = "button" >Menu</button></a>
	


	
</body>
</html>