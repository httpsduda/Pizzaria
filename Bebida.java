/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizzaria;

/**
 *
 * @author Duda
 */
public class Bebida {
    
    private String nome;
    private int quant;
    private double preco;
    
    public Bebida(){
        
    }
    
    public void setNome(String value){
        this.nome = value;
    }
    
    public void setQuant(int value){
        this.quant = value;
    }
    
    public void setPreco(double value){
        this.preco = value;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getQuant(){
        return this.quant;
    }
    
    public double getPreco(){
        return this.preco;
    }
}
