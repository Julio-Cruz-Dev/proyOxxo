<%-- 
    Document   : ctlProveedores
    Created on : 20/07/2018, 08:54:32 PM
    Author     : julio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

        </style>
    </head>
    <body>
        <table  width="98%">
            <tr align="center">
                <td class="lbltitulo">PROVEEDORES DE TELEFONÍA</td>    
            </tr>
        </table>        
        <form   action="" method="post">            
          <table>
            <tr>               
                <td>
                    <label  for="name">Nombre</label>
                    <input type="text" id="proveedor" name="nombre">            
                </td>
            </tr>
            <tr>                
                <td>
                    <label for="mail">Descripción</label>
                    <input type="text" id="pdescripcion" name="descripcion">
                </td>       
                 <td>
                    <label for="mail">Impuesto</label> 
                    <input  id="pimpuesto" name="impuesto">
                </td>
            </tr>          
          </table>  
         <hr class="linea"/>
         <table  width="98%"  >
            <tr align="center">
                <td>
                    <input type="submit" name="Guardar" value="Guardar"  
                           onclick= this.form.action="altaCatProveedores">
                    <input type="submit" name="Buscar" value ="Buscar" 
                         onclick= this.form.action="catProveedores">
                </td>
            </tr>
        </table>
        </form>
       
    </body>
</html>
