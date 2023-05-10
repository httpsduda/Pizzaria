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

public class Cardapio {
    
    private String nomePizzaria;
    private List<Pizza> Pizzas = new ArrayList();
    private List<Bebida> Bebidas = new ArrayList();
    
    public void setNomePizzaria(String value){
        this.nomePizzaria = value;
    }
    
    public void adicionarPizza(Pizza pizzas){
        this.Pizzas.add(pizzas);
    }
    
    public void adicionarBebidas(Bebida bebidas){
        this.Bebidas.add(bebidas);
    }
    
    public String getNomePizzaria(){
        return this.nomePizzaria;
    }
    
    public List<Bebida> getBebidas(){
        return this.Bebidas;
    }
    
    public List<Pizza> getPizzas(){
        return this.Pizzas;
    }
}
