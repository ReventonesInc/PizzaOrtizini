/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;
import clases.Cliente;
import java.util.ArrayList;
/**
 *
 * @author ceap2
 */
public class ListaCliente {
    private ArrayList<Cliente> listaC;

    public ListaCliente(ArrayList<Cliente> listaC) {
        this.listaC = listaC;
    }

    public ArrayList<Cliente> getListaC() {
        return listaC;
    }
}
