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
    private String nombre;
    private String apepaterno;
    private String apematerno;
    private String telefono;
    private String telefonia;
    private Respuesta respuesta;

    public RespuestaSaldo() {
    }

    public RespuestaSaldo(String nombre, String apepaterno, String apematerno, String telefono, String telefonia, Respuesta respuesta) {
        this.nombre = nombre;
        this.apepaterno = apepaterno;
        this.apematerno = apematerno;
        this.telefono = telefono;
        this.telefonia = telefonia;
        this.respuesta = respuesta;
    }

    public RespuestaSaldo(Respuesta respuesta) {
        this.respuesta = respuesta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApepaterno() {
        return apepaterno;
    }

    public void setApepaterno(String apepaterno) {
        this.apepaterno = apepaterno;
    }

    public String getApematerno() {
        return apematerno;
    }

    public void setApematerno(String apematerno) {
        this.apematerno = apematerno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefonia() {
        return telefonia;
    }

    public void setTelefonia(String telefonia) {
        this.telefonia = telefonia;
    }

    public Respuesta getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Respuesta respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "RespuestaSaldo{" + "saldo=" + saldo + ", nombre=" + nombre + ", apepaterno=" + apepaterno + ", apematerno=" + apematerno + ", telefono=" + telefono + ", telefonia=" + telefonia + ", respuesta=" + respuesta + '}';
    }
    
}
