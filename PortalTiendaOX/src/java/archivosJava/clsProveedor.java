/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosJava;

import java.sql.SQLException;
import java.util.List;
import service.ProveedoresTelefonia;
import service.RespuestaGetProveedoresTelefonia;
/**
 *
 * @author julio
 */
public class clsProveedor {
    
       
         
          public String[][]  Listar() throws SQLException {
              
////            conexionPool mp = new conexionPool(); 
////            ResultSet rs = null;
////            Connection con = mp.ds.getConnection();            
////            try {                               
                
////                Statement stm = con.createStatement();
////               rs = stm.executeQuery("select id,Nombre from clt_proveedor_telefonia");
               RespuestaGetProveedoresTelefonia result= getProveedoresTelefonia(); 
                List datos =  result.getProveedores();
                String arreglo[][] = new String[2][datos.size()];
                ProveedoresTelefonia prov = new ProveedoresTelefonia();
                 for (int i= 0;i<datos.size();i++) 
                 {  
                    prov = (ProveedoresTelefonia)  datos.get(i); 
                    arreglo[0][i] = Integer.toString(prov.getIdTelefonia());
                    arreglo[1][i] = prov.getNombre();
                 
                  //ProveedoresTelefonia prov = new ProveedoresTelefonia();               
                }
               
////             }
////             catch (Exception e) 
////             {
////             }
              return arreglo;
           }  

    private static RespuestaGetProveedoresTelefonia getProveedoresTelefonia() {
        service.WSTelefonia_Service service = new service.WSTelefonia_Service();
        service.WSTelefonia port = service.getWSTelefoniaPort();
        return port.getProveedoresTelefonia();
    }


}
