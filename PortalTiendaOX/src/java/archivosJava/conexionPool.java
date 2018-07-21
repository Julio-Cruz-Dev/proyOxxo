/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosJava;

//import java.util.concurrent.ExecutionException;
import javax.sql.DataSource;
//import javax.websocket.RemoteEndpoint.Basic;
import org.apache.tomcat.dbcp.dbcp.BasicDataSource;

/**
 *
 * @author julio
 */
public class conexionPool {
    
        public DataSource ds;
    
    public conexionPool(){
      inicializaDS();
    }
    
    private void inicializaDS(){
    
            BasicDataSource bds = new BasicDataSource();
            try
            {
                bds.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                bds.setUsername("sa");
                bds.setPassword("randrade");
                //bds.setUrl("jdbc:sqlserver://" + "CHUMBYDROID\\SQL2008R2" +";databaseName=Escuela");    
                bds.setUrl("jdbc:sqlserver://" + "10.11.44.108" +";databaseName=oxxo");    
                
                bds.setMaxActive(1);
                bds.setValidationQuery("Select 1");
                ds=bds;
            }
            catch(Exception ex){
                
            }
    
    }
    
}
