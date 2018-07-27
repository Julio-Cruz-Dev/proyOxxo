/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author black
 */
public class RespuestaSaldo {
    private double saldo = 0;
    private Respuesta respuesta;

    public RespuestaSaldo() {
    }

    public RespuestaSaldo(double saldo, Respuesta respuesta) {
        this.saldo = saldo;
        this.respuesta = respuesta;
    }

   

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Respuesta getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Respuesta respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "RespuestaSaldo{" + "saldo=" + saldo + ", respuesta=" + respuesta + '}';
    }

    
}
