/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pizzaria;

/**
 *
 * @author Duda
 */
public class Pizza {
    
    private String nome;
    private String sabor;
    private String ingredientes;
    private int tamanho;
    private double preco;
    
    public Pizza(){
        
    }
    
    public Pizza(String nome_, String sabor_, String ingredientes_, int tamanho_, double preco_){
        this.nome = nome_;
        this.sabor = sabor_;
        this.ingredientes = ingredientes_;
        this.tamanho = tamanho_;
        this.preco = preco_;
    } 
    
    public void setNome(String value){
        this.nome = value;
    }
    
    public void setSabor(String value){
        this.sabor = value;
    }
    
    public void setIngredientes(String value){
        this.ingredientes = value;
    }
    
    public void setTamanho(int value){
        this.tamanho = value;
    }
    
    public void setPreco(double value){
        this.preco = value;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getSabor(){
        return this.sabor;
    }
    
    public String getIngredientes(){
        return this.ingredientes;
    }
    
    public int getTamanho(){
        return this.tamanho;
    }
    
    public double getPreco(){
        return this.preco;
    }    
}
