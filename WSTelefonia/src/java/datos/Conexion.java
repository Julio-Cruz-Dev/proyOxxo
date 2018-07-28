/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Entidades.ProveedoresTelefonia;
import Entidades.TiposMovimiento;
import Objetos.RespuestaGetProveedoresTelefonia;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.SaldoModel;
import modelos.UsoTelefonoModel;

/**
 *
 * @author Rogelio Andrade
 */
public class Conexion {

    private static volatile Conexion conexion;
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    //String connectionUrl = "jdbc:sqlserver://10.11.44.108\\SQLEXPRESS:1433;"
                    //+ "databaseName=oxxo;";
            
    String connectionUrl = "jdbc:sqlserver://10.11.44.108\\SQLEXPRESS:1433;databaseName=oxxo;";
    Connection con = null;

//    public static Conexion getInstance(){
//        Object lock = new Object();
//        Conexion conexion = Conexion.conexion;
//        if(conexion == null){
//            synchronized(lock){
//                conexion = Conexion.conexion;
//                if(conexion == null){
//                    Conexion.conexion = conexion = new Conexion();
//                }
//            }
//        }
//        return conexion;
//    }
    public static void main(String[] args) {
        new Conexion();
    }

    public Conexion() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(connectionUrl, "sa", "randrade");
            try {
                //System.out.println(ponerSaldo(new SaldoModel("4771112781", 1, 199)));
                //System.out.println(getSaldo(new SaldoModel("4771112781")));
            } catch (Exception ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int ponerSaldo(SaldoModel model) throws Exception {
        try {

            CallableStatement cstmt = con.prepareCall("{call SP_Alta_Saldo(?,?, ?, ?)}");
            cstmt.setString(1, model.getNoCelular());
            cstmt.setString(2, String.valueOf(model.getIdTelefonia()));
            cstmt.setString(3, String.valueOf(model.getMonto()));
            cstmt.registerOutParameter(4, java.sql.Types.INTEGER);
            cstmt.execute();
            int result = cstmt.getInt(4);
            cstmt.close();

            return result;

        } catch (SQLException ex) {
            System.out.println("Error al realizar recarga: " + ex.getMessage());
            //con.rollback();
            throw ex;
        } finally {

        }
    }

    public double getSaldo(SaldoModel model) throws Exception {
        String strSql = "select top 1 t.saldo as saldo from tbl_persona as p inner join tbl_telefonia  as t on p.id = t.id_persona  where telefono = '" + model.getNoCelular() + "'";
        Statement stm;
        ResultSet rs;
        double fltSaldo = 0;
        try {
            stm = con.createStatement();

            //ejecuto la consulta
            rs = stm.executeQuery(strSql);

            while (rs.next()) {
                System.out.println(rs.getDouble("saldo"));
                fltSaldo = rs.getDouble("saldo");
            }
            //cierro el  ResultSet
            rs.close();

        } catch (Exception ex) {
            System.out.println("Error al obtener el saldo: " + ex.getMessage());
            //con.rollback();
            throw ex;
        }
        return fltSaldo;
    }
    
    
    public List<ProveedoresTelefonia> getListProveedores() throws Exception {
        String strSql = "select * from clt_proveedor_telefonia";
        Statement stm;
        ResultSet rs;
        
        List<ProveedoresTelefonia> listaProveedores = new ArrayList<ProveedoresTelefonia>();
        try {
            stm = con.createStatement();

            rs = stm.executeQuery(strSql);

            while (rs.next()) {
                listaProveedores.add(new ProveedoresTelefonia(rs.getInt("id"), rs.getString("nombre"), rs.getString("descripcion"), rs.getFloat("impuestos")));
            }
            //cierro el  ResultSet
            rs.close();

        } catch (Exception ex) {
            System.out.println("Error al obtener lista de proveedores: " + ex.getMessage());
            //con.rollback();
            throw ex;
        }
        return listaProveedores;
    }
    
    
    public List<TiposMovimiento> getListTiposMovimiento() throws Exception {
        String strSql = "select * from clt_tipo_movimiento";
        Statement stm;
        ResultSet rs;
        
        List<TiposMovimiento> lista = new ArrayList<TiposMovimiento>();
        try {
            stm = con.createStatement();

            rs = stm.executeQuery(strSql);

            while (rs.next()) {
                lista.add(new TiposMovimiento(rs.getInt("id"), rs.getString("tipo"), rs.getString("descripcion"), rs.getFloat("costo")));
            }
            //cierro el  ResultSet
            rs.close();

        } catch (Exception ex) {
            System.out.println("Error al obtener lista de proveedores: " + ex.getMessage());
            //con.rollback();
            throw ex;
        }
        return lista;
    }
    
    
    public int UsoTelefono(UsoTelefonoModel model) throws Exception {
        try {

            CallableStatement cstmt = con.prepareCall("{call SP_Uso_Tel(?,?,?,?,?)}");
            cstmt.setInt(1, model.getIdTipoMovimiento());
            cstmt.setInt(2, model.getIdTelefonia());
            cstmt.setFloat(3, model.getMonto());
            cstmt.setString(4, model.getNoCelular());
            cstmt.registerOutParameter(5, java.sql.Types.INTEGER);
            cstmt.execute();
            int result = cstmt.getInt(5);
            cstmt.close();

            return result;

        } catch (SQLException ex) {
            System.out.println("Error al realizar uso del telefono: " + ex.getMessage());
            //con.rollback();
            throw ex;
        } finally {

        }
    }
    
    
    public boolean InsertaProveedor(ProveedoresTelefonia proveedor) throws SQLException{
        Statement stm = null;
        try{
            String query = "insert into clt_proveedor_telefonia values('"+proveedor.getNombre()+"', '"+proveedor.getDescripcion()+"', "+proveedor.getImpuestos()+")";
            stm = con.createStatement();
            int ejecuta = stm.executeUpdate(query);
            stm.close();
            if (ejecuta >= 1) {
                return true;
            } else {
                return false;
            }
        }catch(SQLException ex){
            System.out.println("Error al insertar proveedor: " + ex.getMessage());
            //con.rollback();
            throw ex;
        }
    }
    
    public boolean InsertaTipoMovimiento(TiposMovimiento tiposMovimiento) throws SQLException{
        Statement stm = null;
        try{
            String query = "insert into clt_tipo_movimiento values('"+tiposMovimiento.getTipo()+"', '"+tiposMovimiento.getDescripcion()+"', "+tiposMovimiento.getCosto()+")";
            stm = con.createStatement();
            int ejecuta = stm.executeUpdate(query);
            stm.close();
            if (ejecuta >= 1) {
                return true;
            } else {
                return false;
            }
        }catch(SQLException ex){
            System.out.println("Error al insertar tipo movimiento: " + ex.getMessage());
            //con.rollback();
            throw ex;
        }
    }
}
