package refrendo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WS_Abono_Refrendo")
public class WS_Abono_Refrendo {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Abono_refrendo")
    public Integer Abono_refrendo(@WebParam(name = "Placas") String Placas, @WebParam(name = "Pago") double Pago) {
        //TODO write your implementation code here:
        
        Connection con;
        CallableStatement cstm;
        
        Integer resultado = 0;

        
       try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://EMORALESLP\\SQLEXPRESS;databaseName=Oxxo","sa","Davidcito007");    

            //Preparamos a Callablestatement y pasamos parametros para su ejecucion 
            cstm = con.prepareCall("{CALL dbo.SP_Abono_Refrendo(?,?,?)}");

            cstm.setString(1, Placas);
            cstm.setDouble(2,Pago);
            
            cstm.registerOutParameter(3, java.sql.Types.INTEGER);
            

            cstm.execute();
             resultado = cstm.getInt(3);
            cstm.close();
                       
            return  resultado ;
       
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
        
        return resultado;
    }


}
