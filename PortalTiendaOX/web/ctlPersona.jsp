<%-- 
    Document   : ctlPersona
    Created on : 20/07/2018, 10:32:29 PM
    Author     : julio
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="archivosJava.clsProveedor"%>
 <%
            clsProveedor objpv = new clsProveedor();
%>

<!DOCTYPE html>
<html>      
    <head>

       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
        <style>
            .linea 
            {	            
                    width:98%; 
                    color:#FAFAFA;
            }  
                        .lbltitulo
            {
                text-align: center;
                font-size:medium;
                color:#605D5C; 
                font-weight:bold;
            }
                        form {
              /* Just to center the form on the page */
              margin: 0 auto;
              width: 1000px;

              /* To see the limits of the form */
              padding: 1em;
              border: 1px solid #CCC;
              border-radius: 1em;
            }

            div + div {
              margin-top: 1em;
            }

            label {
              /* To make sure that all label have the same size and are properly align */
              display: inline-block;
              width: 90px;
              text-align: right;
            }

            input, textarea {
              /* To make sure that all text field have the same font settings
                 By default, textarea are set with a monospace font */
              font: 1em sans-serif;

              /* To give the same size to all text field */
              width: 300px;

              -moz-box-sizing: border-box;
                   box-sizing: border-box;

              /* To harmonize the look & feel of text field border */
              border: 1px solid #999;
            }

            input:focus, textarea:focus {
              /* To give a little highligh on active elements */
              border-color: #000;
            }

            .button {
              /* To position the buttons to the same position of the text fields */
              padding-left: 90px; /* same size as the label elements */
            }

            button {
              /* This extra magin represent the same space as the space between
                 the labels and their text fields */
              margin-left: .5em;
            }
        </style>
        <script>
            function ShowSelected()
            {
            /* Para obtener el valor */
            var cod = document.getElementById("opciones").value;
            document.getElementById("hide").value = cod;}
            function valordos(){                
                 var cod = document.getElementById("tipo").value;
                document.getElementById("hide2").value = cod; //alert(cod); 
            }            
        </script>
        </head>
    <body>
        <table  width="98%">
            <tr align="center">
                <td class="lbltitulo">PERSONA</td>    
            </tr>
        </table>        
        <form   action="/my-handling-form-page" method="post">            
            <input id="hide" name="hide" style="width:0px;height:0px">
            <input id="hide2" name="hide" style="width:0px;height:0px">
          <table>
            <tr>               
                <td>
                    <label for="name">Nombre</label>
                    <input type="text" id="nombre" name="nombre">            
                </td>
                <td>
                    <label for="name">Ap. Paterno</label>
                    <input type="text" id="apaterno" name="apaterno">            
                </td>
            </tr>
            <tr>                
                <td>
                    <label for="mail">Ap. Materno</label>
                    <input type="text" id="amaterno" name="amaterno">
                </td>       
                 <td>
                    <label for="mail">Teléfono</label> 
                    <input  id="telefono" name="telefono">
                </td>
            </tr>   
            <tr>
               <%-- <td>
                  <label for="mail">TIPO</label>   
                  <select name="tipo" id="tipo" onchange="valordos();" >
                    <option value="0">SELECCIONE</option>  
                    <option value="1">TELEFONIA</option>
                    <option value="2">REFRENDO</option>                                        
                  </select> 
                </td>--%>    
                <td>
                 <label for="proveedor">Proveedor</label>   
                 <select name="opciones" id="opciones" onchange="ShowSelected();" >
                  <option value="0">SELECCIONE</option>
                  <%
                                String datos[][] = new String[40][40];
                                datos= objpv.Listar();                                
                                 for (int i= 0;i<datos.length;i++) {  
                                  
                    %>
                   <option value="<%=datos[0][i]%>"><%=datos[1][i]%></option>                                                                                
                   <%
                                }
                    %>
                    </select>                      
                </td>    
            </tr>
            <%-- <tr>
                <td>
                    <label for="Placas">Placas</label> 
                    <input  id="placas" name="placas">
                </td>
            </tr>--%>
          </table>  
         <hr class="linea"/>
         <table  width="98%"  >
            <tr align="center">
                <td>
                    <input type="submit" name="Guardar" value="Guardar"  
                           onclick= this.form.action="altaPersona">
                    <%--<input type="submit" name="Buscar" value ="Buscar" 
                         onclick= this.form.action="consultaPersona">--%>
                </td>
            </tr>
        </table>
        </form>
       
    </body>
</html>