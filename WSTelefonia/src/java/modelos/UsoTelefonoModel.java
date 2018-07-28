/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

/**
 *
 * @author black
 */
public class UsoTelefonoModel {
    private int idTelefonia;
    private int idTipoMovimiento;
    private float monto;
    private String noCelular;

    public UsoTelefonoModel() {
    }

    public UsoTelefonoModel(int idTelefonia, int idTipoMovimiento, float monto, String noCelular) {
        this.noCelular = noCelular;
        this.idTelefonia = idTelefonia;
        this.monto = monto;
        this.idTipoMovimiento = idTipoMovimiento;
    }

    public String getNoCelular() {
        return noCelular;
    }

    public void setNoCelular(String noCelular) {
        this.noCelular = noCelular;
    }

    public int getIdTelefonia() {
        return idTelefonia;
    }

    public void setIdTelefonia(int idTelefonia) {
        this.idTelefonia = idTelefonia;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getIdTipoMovimiento() {
        return idTipoMovimiento;
    }

    public void setIdTipoMovimiento(int idTipoMovimiento) {
        this.idTipoMovimiento = idTipoMovimiento;
    }

    @Override
    public String toString() {
        return "UsoTelefonoModel{" + "noCelular=" + noCelular + ", idTelefonia=" + idTelefonia + ", monto=" + monto + ", idTipoMovimiento=" + idTipoMovimiento + '}';
    }
    
}
