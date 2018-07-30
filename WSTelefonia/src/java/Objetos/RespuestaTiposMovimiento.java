/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Entidades.TiposMovimiento;
import java.util.List;
/**
 *
 * @author black
 */
public class RespuestaTiposMovimiento {
    private List<TiposMovimiento> tiposMovimiento;
    private Respuesta respuesta;

    public RespuestaTiposMovimiento(List<TiposMovimiento> tiposMovimiento) {
        this.tiposMovimiento = tiposMovimiento;
    }
    
    public RespuestaTiposMovimiento() {
    }

    public RespuestaTiposMovimiento(Respuesta respuesta) {
        this.respuesta = respuesta;
    }

    public RespuestaTiposMovimiento(List<TiposMovimiento> tiposMovimiento, Respuesta respuesta) {
        this.tiposMovimiento = tiposMovimiento;
        this.respuesta = respuesta;
    }

    public List<TiposMovimiento> getTiposMovimiento() {
        return tiposMovimiento;
    }

    public void setTiposMovimiento(List<TiposMovimiento> tiposMovimiento) {
        this.tiposMovimiento = tiposMovimiento;
    }

    public Respuesta getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Respuesta respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "RespuestaTiposMovimiento{" + "tiposMovimiento=" + tiposMovimiento + ", respuesta=" + respuesta + '}';
    }
    
    
}
