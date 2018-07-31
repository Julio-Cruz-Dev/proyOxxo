<%-- 
    Document   : FormRecargaTel
    Created on : 28-jul-2018, 14:00:52
    Author     : tazj13857
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="css/DisenioForm.css">
        <title>Recarga Telefono</title>
        <script type="text/javascript">
            function valida(f) {
                var ok = true;
                var msg = "El campo solo acepta numeros \n";
 
                if (isNaN(parseInt(f.numero.value)))
                    {
                    //msg += "- Debe contener numeros\n";
                    ok = false;
                    }

                if(ok == false)
                alert(msg);
                return ok;
  
            }
        </script>
    </head>
    <body>
        <header> 
		<div class="logotipo">
		<img src="css/univa.jpg" width="300" alt="">
		</div>
		<nav>
			<ul>
			<li></li>
			<li></li>
			</ul>
		</nav>
	</header>
        <form name="ConsultaTel" action="ServletRecargaTel" method="POST" onsubmit="return valida(this)">
            <h1> Recarga de Saldo Telefonico </h1>
            
            <label for="nombre">Ingresa el Número de Telefonia:</label>
	    <input type="text" name="txtNumTelefonia" id="numerotelefonia" placeholder="Escribe el Número de Telefonia">
            
            <label for="nombre">Ingresa el Monto :</label>
	    <input type="text" name="txtMonto" id="monto" placeholder="Escribe el Monto">
            
            <label for="nombre">Ingresa Número Telefonico:</label>
	    <input type="text" name="txtNumTel" id="numero" placeholder="Escribe tu Número">
            
            <input type="submit" value="Consultar" name="btnConsTel" />
              <p></p>
		<a href="index.jsp">
		<input type="button" value="Regresar" name="submit" />
		</a>
		
        </form>
    </body>
</html>
