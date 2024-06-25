/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Proveedor {
    private int id_proveedor;
    private String nombre;
    private float precio;


    public Proveedor(int id_proveedor, String nombre, float precio) {
        this.id_proveedor = id_proveedor;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public float getId_proveedor() {
        return id_proveedor;
    }

    public void setId(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setId(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
