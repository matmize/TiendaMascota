<html>
<head>
	
</head>

<body>
    <h1>Modificar Empleado</h1>

    <%@ page import = "servlet.*" %>
   <%@ page import = "java.lang.Math.*" %>

   <%
        Unico unico = Unico.getInstance();

        int id = Math.abs(Integer.parseInt(request.getParameter("id")));
        String nombre = request.getParameter("nombre");
        String habilidad = request.getParameter("habilidad");

        if (unico.buscarEmpleado(id).idEmpleado == -100){
           
            unico.editarEmpleado(id,nombre,habilidad);

           


        }
    
    %>

    <p>Se modifico al empleado con el ID <%= Math.abs(Integer.parseInt(request.getParameter("id")))%></p>

    <a href = "modificarEmpleado.html"><button  type="button">Volver</button></a><a href = "index.html"><button type = "button" >Menu</button></a>
	


	
</body>
</html>