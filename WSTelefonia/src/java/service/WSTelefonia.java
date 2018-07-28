/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Entidades.Cliente;
import Entidades.ProveedoresTelefonia;
import Entidades.TiposMovimiento;
import Objetos.Respuesta;
import Objetos.RespuestaGetProveedoresTelefonia;
import Objetos.RespuestaSaldo;
import Objetos.RespuestaTiposMovimiento;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelos.SaldoModel;
import modelos.UsoTelefonoModel;
import negocio.TelefoniaController;

/**
 *
 * @author black
 */
@WebService(serviceName = "WSTelefonia")
public class WSTelefonia {

    /**
     * Método para hacer una recarga a un número de teléfono.
     *
     * @param noCel
     * @param idTelefonia
     * @param monto
     * @return Respuesta
     */
    @WebMethod(operationName = "Recarga")
    public synchronized Respuesta Recarga(@WebParam(name = "noCel") String noCel,
            @WebParam(name = "idTelefonia") int idTelefonia,
            @WebParam(name = "monto") float monto) {
        TelefoniaController controller = new TelefoniaController();
        try {

            SaldoModel modelo = new SaldoModel(noCel, idTelefonia, monto);
            return controller.ponerSaldo(modelo);
        } catch (Exception ex) {
            System.out.println("Error en el web service: " + ex.getMessage());
            return new Respuesta(false, "Error en el web service: " + ex.getMessage());
        } finally {
            controller = null;
        }

    }
    
    /**
     * Método para obtener el saldo de un número de teléfono.
     *
     * @param noCel
     * @return RespuestaSaldo
     */
    @WebMethod(operationName = "Saldo")
    public synchronized RespuestaSaldo Saldo(@WebParam(name = "noCel") String noCel) {
        TelefoniaController controller = new TelefoniaController();
        try {

            SaldoModel modelo = new SaldoModel(noCel);
            return controller.getSaldo(modelo);
        } catch (Exception ex) {
            System.out.println("Error en el web service: " + ex.getMessage());
            return  new RespuestaSaldo(new Respuesta(false, "Error en el web service: " + ex.getMessage()));
        } finally {
            controller = null;
        }
    }
    
    
    /**
     * Método para obtener listado de proveedores de telefonia.
     *
     * @return RespuestaGetProveedoresTelefonia
     */
    @WebMethod(operationName = "GetProveedoresTelefonia")
    public synchronized RespuestaGetProveedoresTelefonia GetProveedoresTelefonia() {
        TelefoniaController controller = new TelefoniaController();
        try {
            return controller.getListProveedores();
        } catch (Exception ex) {
            System.out.println("Error en el web service: " + ex.getMessage());
            return  new RespuestaGetProveedoresTelefonia(new Respuesta(false, "Error en el web service: " + ex.getMessage()));
        } finally {
            controller = null;
        }
    }
    
    /**
     * Método para obtener listado de tipos de movimiento.
     *
     * @return RespuestaTiposMovimiento
     */
    @WebMethod(operationName = "GetTiposMovimiento")
    public synchronized RespuestaTiposMovimiento GetTiposMovimiento() {
        TelefoniaController controller = new TelefoniaController();
        try {
            return controller.getListTiposMovimiento();
        } catch (Exception ex) {
            System.out.println("Error en el web service: " + ex.getMessage());
            return  new RespuestaTiposMovimiento(new Respuesta(false, "Error en el web service: " + ex.getMessage()));
        } finally {
            controller = null;
        }
    }
    
    /**
     * Método para hacer registrar cargo a un número de teléfono.
     *
     * @param idTipoMovimiento
     * @param idTelefonia
     * @param tiempo
     * @param noCel
     * @return Respuesta
     */
    @WebMethod(operationName = "UsoTelefono")
    public synchronized Respuesta UsoTelefono(@WebParam(name = "idTipoMovimiento") int idTipoMovimiento,
            @WebParam(name = "idTelefonia") int idTelefonia,
            @WebParam(name = "tiempo") float tiempo,
            @WebParam(name = "noCel") String noCel) {
        TelefoniaController controller = new TelefoniaController();
        try {

            UsoTelefonoModel modelo = new UsoTelefonoModel(idTelefonia, idTipoMovimiento, tiempo, noCel);
            return controller.UsoTelefono(modelo);
        } catch (Exception ex) {
            System.out.println("Error en el web service: " + ex.getMessage());
            return new Respuesta(false, "Error en el web service: " + ex.getMessage());
        } finally {
            controller = null;
        }

    }
    
    /**
     * Método para hacer registrar un cliente.
     *
     * @param cliente  
     * @return Respuesta
     */
    @WebMethod(operationName = "InsertaCliente")
    public synchronized Respuesta InsertaCliente(@WebParam(name = "cliente") Cliente cliente) {
        TelefoniaController controller = new TelefoniaController();
        try {
            return controller.InsertaCliente(cliente);
        } catch (Exception ex) {
            System.out.println("Error en el web service: " + ex.getMessage());
            return new Respuesta(false, "Error en el web service: " + ex.getMessage());
        } finally {
            controller = null;
        }
    }
    
    /**
     * Método para hacer registrar un proveedor.
     *
     * @param proveedor 
     * @return Respuesta
     */
    @WebMethod(operationName = "InsertaProveedor")
    public synchronized Respuesta InsertaProveedor(@WebParam(name = "proveedor") ProveedoresTelefonia proveedor) {
        TelefoniaController controller = new TelefoniaController();
        try {
            return controller.InsertaProveedor(proveedor);
        } catch (Exception ex) {
            System.out.println("Error en el web service: " + ex.getMessage());
            return new Respuesta(false, "Error en el web service: " + ex.getMessage());
        } finally {
            controller = null;
        }
    }
    
    /**
     * Método para hacer registrar un tipo de movimiento.
     *
     * @param tiposMovimiento  
     * @return Respuesta
     */
    @WebMethod(operationName = "InsertaTipoMovimiento")
    public synchronized Respuesta InsertaTipoMovimiento(@WebParam(name = "tiposMovimiento") TiposMovimiento tiposMovimiento) {
        TelefoniaController controller = new TelefoniaController();
        try {
            return controller.InsertaTipoMovimiento(tiposMovimiento);
        } catch (Exception ex) {
            System.out.println("Error en el web service: " + ex.getMessage());
            return new Respuesta(false, "Error en el web service: " + ex.getMessage());
        } finally {
            controller = null;
        }
    }
}
