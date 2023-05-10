/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizzaria;

/**
 *
 * @author Duda
 */
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private List<Pizza> Pizzas = new ArrayList();
    private List<Bebida> Bebidas = new ArrayList();
    private int numMesa;
    
    public void adicionarPizza(Pizza pizzas){
        this.Pizzas.add(pizzas);
    }
    
    public void adicionarBebidas(Bebida bebidas){
        this.Bebidas.add(bebidas);
    }
    
    public void setNumMesa(int value){
        this.numMesa = value;
    }
    
    public int getNumMesa(){
        return this.numMesa;
    }
    
    public List<Bebida> getBebidas(){
        return this.Bebidas;
    }
    
    public List<Pizza> getPizza(){
        return this.Pizzas;
    }
}
