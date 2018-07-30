
package refrendo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "WS_Alta_Refrendo")
public class WS_Alta_Refrendo {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AltaRefrendo")
    public String AltaRefrendo(@WebParam(name = "nombre") String nombre, @WebParam(name = "a_paterno") String a_paterno, @WebParam(name = "a_materno") String a_materno, @WebParam(name = "telefono") String telefono, @WebParam(name = "placas") String placas) {
        //TODO write your implementation code here:
        Connection con;
        CallableStatement cstm;
        String resultado = "Vacio";
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://EMORALESLP\\SQLEXPRESS;databaseName=Oxxo","sa","Davidcito007");    

            //Preparamos a Callablestatement y pasamos parametros para su ejecucion 
            cstm = con.prepareCall("{CALL dbo.SP_Alta_Refrendo(?,?,?,?,?,?)}");

            cstm.setString(1, nombre);
            cstm.setString(2,a_paterno);
            cstm.setString(3,a_materno);
            cstm.setString(4, telefono);
            cstm.setString(5, placas);
            
            cstm.registerOutParameter(6, java.sql.Types.CHAR);
            

            cstm.execute();
             resultado = cstm.getString(6);
            cstm.close();
                       
            return  resultado ;
       
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
        
        return resultado;
    }

  

}
