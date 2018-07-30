/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author black
 */
public class SaldoModel {
    private String noCelular;
    private int idTelefonia;
    private float monto;

    public SaldoModel() {
    }

    public SaldoModel(String noCelular) {
        this.noCelular = noCelular;
    }
    
    public SaldoModel(String noCelular, int idTelefonia, float monto) {
        this.noCelular = noCelular;
        this.idTelefonia = idTelefonia;
        this.monto = monto;
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

    @Override
    public String toString() {
        return "SaldoModel{" + "noCelular=" + noCelular + ", idTelefonia=" + idTelefonia + ", monto=" + monto + '}';
    }
    
}
