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
public class ProveedoresTelefonia {
    private int idTelefonia;
    private String nombre;
    private String descripcion;
    private float impuestos;

    public ProveedoresTelefonia() {
    }

    public ProveedoresTelefonia(int idTelefonia, String nombre, String descripcion, float impuestos) {
        this.idTelefonia = idTelefonia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.impuestos = impuestos;
    }

    public int getIdTelefonia() {
        return idTelefonia;
    }

    public void setIdTelefonia(int idTelefonia) {
        this.idTelefonia = idTelefonia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(float impuestos) {
        this.impuestos = impuestos;
    }

    @Override
    public String toString() {
        return "ProveedoresTelefonia{" + "idTelefonia=" + idTelefonia + ", nombre=" + nombre + ", descripcion=" + descripcion + ", impuestos=" + impuestos + '}';
    }
    
}
