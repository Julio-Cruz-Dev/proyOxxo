<%-- 
    Document   : catProveedores
    Created on : 15/07/2018, 03:24:46 PM
    Author     : julio
--%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-bootgrid/1.3.1/jquery.bootgrid.css" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>	
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-bootgrid/1.3.1/jquery.bootgrid.js"></script>   
    <script>         
       $(document).ready( function () {
           $("#grid-basic").bootgrid();               
        } );
   </script>
</head>
<body>      
    <form name="catProveedores" action="catProveedores" method="post" >
        <!--<table id="grid-basic" class="table table-condensed table-hover table-striped">
            <thead>
                <tr>
                    <th data-column-id="id" data-type="numeric">ID</th>
                    <th data-column-id="sender">Sender</th>
                    <th data-column-id="received" data-order="desc">Received</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>10238</td>
                    <td>eduardo@pingpong.com</td>
                    <td>14.10.2013</td>
                </tr>
                ...
            </tbody>
        </table>-->
        <input type="submit" value="Consultar" name="btn_guardar" />
    </form>    
</body>
</html>
