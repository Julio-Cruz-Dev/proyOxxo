/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import javax.sql.DataSource;
import org.apache.tomcat.dbcp.dbcp.BasicDataSource;

/**
 *
 * @author tazj13857
 */
public class Conexion {
    
    public DataSource ds;
    
    public Conexion (){
    InicializaDS();
    }
    
    
     public void InicializaDS(){
        BasicDataSource bds = new BasicDataSource();
        
        bds.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        bds.setUsername("sa");
        bds.setPassword("alex123");
        //bds.setPassword("randrade");
        bds.setUrl("jdbc:sqlserver://localhost:1433;databaseName=oxxo");
        //bds.setUrl("jdbc:sqlserver://10.11.44.108:1433;databaseName=oxxo");      
        bds.setMaxActive(20);
        ds=bds;          
    }
}
