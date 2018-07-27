/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Entidades.ProveedoresTelefonia;
import java.util.List;
/**
 *
 * @author black
 */
public class RespuestaGetProveedoresTelefonia {
    
    private List<ProveedoresTelefonia> proveedores;
    
    private Respuesta respuesta;

    public RespuestaGetProveedoresTelefonia() {
        
    }

    public RespuestaGetProveedoresTelefonia(List<ProveedoresTelefonia> proveedores, Respuesta respuesta) {
        this.proveedores = proveedores;
        this.respuesta = respuesta;
    }
    
    public RespuestaGetProveedoresTelefonia(Respuesta respuesta) {
        this.respuesta = respuesta;
    }

    public List<ProveedoresTelefonia> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<ProveedoresTelefonia> proveedores) {
        this.proveedores = proveedores;
    }

    public Respuesta getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Respuesta respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "RespuestaGetProveedoresTelefonia{" + "proveedores=" + proveedores + ", respuesta=" + respuesta + '}';
    }
}
