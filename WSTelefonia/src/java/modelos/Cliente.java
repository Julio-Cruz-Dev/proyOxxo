/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author black
 */
public class Cliente {
    private String nombre;
    private String apepaterno;
    private String apematerno;
    private String telefono;
    private int idproveedor;

    public Cliente() {
    }

    public Cliente(String nombre, String apepaterno, String apematerno, String telefono, int idproveedor) {
        this.nombre = nombre;
        this.apepaterno = apepaterno;
        this.apematerno = apematerno;
        this.telefono = telefono;
        this.idproveedor = idproveedor;
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

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apepaterno=" + apepaterno + ", apematerno=" + apematerno + ", telefono=" + telefono + ", idproveedor=" + idproveedor + '}';
    }
    
}