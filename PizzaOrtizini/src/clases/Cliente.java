/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author ceap2
 */
public class Cliente {
    private String nombreCliente;
    private String telefono;
    private String rut;
    private String direccion;
    //private ArrayList<venta> listaCompras;

    public Cliente(String nombreCliente, String telefono, String rut) {
        this.nombreCliente = nombreCliente;
        this.telefono = telefono;
        this.rut = rut;
    }

    public Cliente(String nombreCliente, String telefono, String rut, String direccion) {
        this.nombreCliente = nombreCliente;
        this.telefono = telefono;
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getRut() {
        return rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
