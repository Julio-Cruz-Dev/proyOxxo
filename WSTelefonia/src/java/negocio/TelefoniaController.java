/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import Entidades.ProveedoresTelefonia;
import Entidades.TiposMovimiento;
import Objetos.Respuesta;
import Objetos.RespuestaGetProveedoresTelefonia;
import Objetos.RespuestaSaldo;
import Objetos.RespuestaTiposMovimiento;
import datos.Conexion;
import java.sql.SQLException;
import java.util.List;
import modelos.SaldoModel;
import modelos.UsoTelefonoModel;

/**
 *
 * @author black
 */
public class TelefoniaController {

    private static TelefoniaController instance;
    private Conexion conexion;

    public TelefoniaController() {
        conexion = new Conexion();
    }

    public Respuesta ponerSaldo(SaldoModel model) {
        Respuesta resp = new Respuesta();
        resp.setSuccess(false);
        try {
            if (model != null) {
                if (conexion.ponerSaldo(model) == 1) {
                    resp.setSuccess(true);
                    resp.setMessage("Se ha realizado la recarga con éxito");
                } else {
                    resp.setMessage("No se pudo realizar la recarga");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
            resp.setMessage(ex.getMessage());
        }

        return resp;
    }
    
    public RespuestaSaldo getSaldo(SaldoModel model) {
        RespuestaSaldo respSaldo = new RespuestaSaldo();
        try {
            if (model != null) {
                RespuestaSaldo saldo =conexion.getSaldo(model);
                if(saldo.getSaldo() >= 1){                   
                    respSaldo.setRespuesta(new Respuesta(true, "Tu saldo es de "+saldo));
                }else{
                    respSaldo.setRespuesta(new Respuesta(true, "Tu saldo está vencido"));
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
            respSaldo.setRespuesta(new Respuesta(false, ex.getMessage())); 
        }

        return respSaldo;
    }
    
     public RespuestaGetProveedoresTelefonia getListProveedores() {
        
        RespuestaGetProveedoresTelefonia respuesta = new RespuestaGetProveedoresTelefonia();
        try {
            List <ProveedoresTelefonia> listaProveedores =conexion.getListProveedores();
            respuesta.setProveedores(listaProveedores);
            respuesta.setRespuesta(new Respuesta(true, "Se ha cargado la lista de proveedores."));
                
        } catch (Exception ex) {
            System.out.println(ex);
            respuesta.setRespuesta(new Respuesta(false, ex.getMessage())); 
        }

        return respuesta;
    }
     
     public RespuestaTiposMovimiento getListTiposMovimiento() {
        
        RespuestaTiposMovimiento respuesta = new RespuestaTiposMovimiento();
        try {
            List <TiposMovimiento> lista =conexion.getListTiposMovimiento();
            respuesta.setTiposMovimiento(lista);
            respuesta.setRespuesta(new Respuesta(true, "Se ha cargado la lista de tipos de movimiento."));
                
        } catch (Exception ex) {
            System.out.println(ex);
            respuesta.setRespuesta(new Respuesta(false, ex.getMessage())); 
        }
        
        return respuesta;
    }
     
    public Respuesta UsoTelefono(UsoTelefonoModel model) {
        Respuesta respuesta = new Respuesta();
        try {
            if (model != null) {
                int resp = conexion.UsoTelefono(model);
                if(resp == 1){
                    respuesta.setSuccess(true);
                    respuesta.setMessage("Se ha realizado el uso con éxito");
                }else{
                    respuesta.setSuccess(false);
                    respuesta.setMessage("No se pudo registrar el uso");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
            respuesta.setSuccess(false);
            respuesta.setMessage(ex.getMessage());
        }

        return respuesta;
    }
    
    public Respuesta InsertaProveedor(ProveedoresTelefonia proveedor) {
        Respuesta respuesta = new Respuesta();
        try {
            if (proveedor != null) {
                if(conexion.InsertaProveedor(proveedor)){
                    respuesta.setSuccess(true);
                    respuesta.setMessage("Se ha insertado el proveedor con éxito");
                }else{
                    respuesta.setSuccess(false);
                    respuesta.setMessage("No se insertar el proveedor");
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            respuesta.setSuccess(false);
            respuesta.setMessage(ex.getMessage());
        }

        return respuesta;
    }
    
    public Respuesta InsertaTipoMovimiento(TiposMovimiento tiposMovimiento) {
        Respuesta respuesta = new Respuesta();
        try {
            if (tiposMovimiento != null) {
                if(conexion.InsertaTipoMovimiento(tiposMovimiento)){
                    respuesta.setSuccess(true);
                    respuesta.setMessage("Se ha insertado el tipo de movimiento con éxito");
                }else{
                    respuesta.setSuccess(false);
                    respuesta.setMessage("No se insertar el tipo de movimiento");
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            respuesta.setSuccess(false);
            respuesta.setMessage(ex.getMessage());
        }

        return respuesta;
    }
    
}
