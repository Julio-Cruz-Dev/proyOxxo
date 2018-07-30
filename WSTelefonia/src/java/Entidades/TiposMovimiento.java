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
public class TiposMovimiento {
    private int id;
    private String tipo;
    private String descripcion;
    private float costo;

    public TiposMovimiento() {
    }

    public TiposMovimiento(int id, String tipo, String descripcion, float costo) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "TiposMovimiento{" + "id=" + id + ", tipo=" + tipo + ", descripcion=" + descripcion + ", costo=" + costo + '}';
    }
    
    
}
