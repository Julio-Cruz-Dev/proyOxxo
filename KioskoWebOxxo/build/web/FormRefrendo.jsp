<%-- 
    Document   : FormRefrendo
    Created on : 26-jul-2018, 19:25:24
    Author     : tazj13857
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/DisenioForm.css">
       <title>Saldo Refrendo</title>
       <script type="text/javascript">
            function valida(f) {
                var ok = true;
                var msg = "El campo no debe estar vacio\n";
 
                if (f.elements["numeroPlacas"].value == "") 
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
        <form name="ConsultaRef" action="ServletConsRef" method="POST" onsubmit="return valida(this)">
            <h1> Consultar Adeudo Refrendo </h1>
            
            <label for="nombre">Ingresa Número de Placas:</label>
	    <input type="text" name="txtNumPlacas" id="numeroPlacas" placeholder="Escribe tu Número de Placas">
            
            <input type="submit" value="Consultar" name="btnConsRef" />
              <p></p>
		<a href="index.jsp">
		<input type="button" value="Regresar" name="submit" />
		</a>
		
        </form>

    </body>
</html>
