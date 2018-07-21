<%-- 
    Document   : menus
    Created on : 14/07/2018, 09:06:37 PM
    Author     : julio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
.vertical-menu {
    width: auto;
    height: auto;
    overflow-y: auto;
}
.vertical-menu a {
    background-color: #FFFFFF;
    color: black;
    display: block;
    padding: 12px;
    text-decoration: none;
}
.vertical-menu a:hover {
    background-color: #E6E6E6;
}
.vertical-menu a.active {
    background-color: #A9A9F5;
    color: white;
}</style>
</head>
<body>
    <div class="vertical-menu" >
      <a href="Inicio.jsp" TARGET=principal class="active">INICIO</a>
      <a href="ctlProveedores.jsp" TARGET=principal>PROVEEDORE TELEFONIA</a>
      <a href="tipoMovimiento.jsp" TARGET=principal>TIPO MOVIMIENTO</a>
      <a href="ctlPersona.jsp" TARGET=principal>PERSONA</a>
      <a href="#">....</a>
      <a href="#">....</a>
    </div>
</body>
</html>