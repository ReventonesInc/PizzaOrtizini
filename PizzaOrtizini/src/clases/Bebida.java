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
public class Bebida extends Producto {
    private boolean esAlcohol;

    public Bebida(boolean esAlcohol, String ID, String nombreProducto, int precio) {
        super(ID, nombreProducto, precio);
        this.esAlcohol = esAlcohol;
    }

    public boolean isEsAlcohol() {
        return esAlcohol;
    }

    public void setEsAlcohol(boolean esAlcohol) {
        this.esAlcohol = esAlcohol;
    }
    
}
