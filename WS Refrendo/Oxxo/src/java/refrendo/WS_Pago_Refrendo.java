package refrendo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WS_Pago_Refrendo")
public class WS_Pago_Refrendo {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Pago_Refrendo")
    public Integer Pago_Refrendo(@WebParam(name = "Placas") String Placas, @WebParam(name = "pago") double pago) {
        //TODO write your implementation code here:
        
        Connection con;
        CallableStatement cstm;
        
        Integer resultado = 0;
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://EMORALESLP\\SQLEXPRESS;databaseName=Oxxo","sa","Davidcito007");    

            //Preparamos a Callablestatement y pasamos parametros para su ejecucion 
            cstm = con.prepareCall("{CALL dbo.SP_Pago_Refrendo(?,?,?)}");

            cstm.setString(1, Placas);
            cstm.setDouble(2, pago);
            
            cstm.registerOutParameter(3, java.sql.Types.INTEGER);
            

            cstm.execute();
             resultado = cstm.getInt(3);
            cstm.close();
                       
            return  resultado ;
       
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
        
        return resultado;


    }
    
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "SaldoRefrendo")
    public double SaldoRefrendo(@WebParam(name = "Placas") String Placas) {
        //TODO write your implementation code here:
        
        Connection con;
        Statement stm;
                ResultSet rs;
        
        Integer resultado = 0;
        double saldo = 0.0;
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://EMORALESLP\\SQLEXPRESS;databaseName=Oxxo","sa","Davidcito007");    

            //Preparamos a Callablestatement y pasamos parametros para su ejecucion 
           stm = con.createStatement();
            rs = stm.executeQuery("SELECT saldo FROM tbl_refrendo WHERE placa='" + Placas + "'");


                if (rs.next()){
            saldo = rs.getDouble("Saldo");
        }
                
            return  saldo ;
       
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
        
        return saldo;


    }
    
    
    
    
    
}
