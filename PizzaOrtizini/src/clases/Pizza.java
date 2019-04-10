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
public class Pizza extends Producto {
    private String[] ingredientes;

    public Pizza(String[] ingredientes, String ID, String nombreProducto, int precio) {
        super(ID, nombreProducto, precio);
        this.ingredientes = ingredientes;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }
    
}
