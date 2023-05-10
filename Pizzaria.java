/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pizzaria;

/**
 *
 * @author Duda
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Pizzaria {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Cardapio cardapio = new Cardapio();
        List<Pedido> pedidos = new ArrayList();
        String opcao = " ";
        
        do {
            opcao = " ";
            
            while(!opcao.equals("A") && !opcao.equals("L") && !opcao.equals("C") && !opcao.equals("LP") && !opcao.equals("S")){
                System.out.println("|A| - Adiocionar item ao cardápio. |L| - Listar cardápio. |C| - Cadastrar pedido. |LP| - Listar pedidos. |S| - Sair.");
                opcao = entrada.nextLine();
            }
            
            switch (opcao){
                
                case "A":
                    
                    String opcao_ = " ";
                    
                    if(cardapio.getPizzas().size() == 0 && cardapio.getBebidas().size() == 0){
                        System.out.print("Informe o nome da Pizzaria: ");
                        cardapio.setNomePizzaria(entrada.nextLine());
                    }
                    
                    do{
                        System.out.println("|CP| - Cadastrar pizza. |CB| - Cadatrar bebida. |S| - Sair. ");
                        opcao_ = entrada.nextLine();
                        
                        if(opcao_.equals("CP")){
                            
                            Pizza pizza = new Pizza();
                            
                            System.out.print("Informe o nome da pizza: ");
                            pizza.setNome(entrada.nextLine());
                            
                            System.out.print("Informe o sabor da pizza: ");
                            pizza.setSabor(entrada.nextLine());
                            
                            System.out.print("Informe os ingredientes da pizza: ");
                            pizza.setIngredientes(entrada.nextLine());
                            
                            System.out.print("Informe o tamanho da pizza (em CM): ");
                            pizza.setTamanho(entrada.nextInt());
                            
                            System.out.print("informe o preço da pizza: ");
                            pizza.setPreco(entrada.nextDouble());
                            
                            entrada.nextLine();
                            
                            cardapio.adicionarPizza(pizza);
                            pizza = null;
                            
                            System.out.println("PIZZA CADASTRADA COM SUCESSO!");
                            
                        }else if(opcao_.equals("CB")){
                            
                            Bebida bebida = new Bebida();
                            
                            System.out.print("Informe o nome da bebida: ");
                            bebida.setNome(entrada.nextLine());
                            
                            System.out.print("Informe a quantidade da babida (em ML): ");
                            bebida.setQuant(entrada.nextInt());
                            
                            System.out.print("informe o preço da bebida: ");
                            bebida.setPreco(entrada.nextDouble());
                            
                            cardapio.adicionarBebidas(bebida);
                            bebida = null;
                            
                            System.out.println("BEBIDA CADASTRADA COM SUCESSO!");
                            entrada.nextLine();
                        }
                    }while(!opcao_.equals("S"));
                    
                    break;
                    
                case "L":
                    
                    if(cardapio.getPizzas().size() > 0 || cardapio.getBebidas().size() > 0){
                        
                        System.out.println("||**********|| Cardápio da Pizzaria " + cardapio.getNomePizzaria() + " ||**********|");
                        
                        if(cardapio.getPizzas().size() > 0){
                            
                            System.out.println("----- PIZZAS -----");
                            
                            for(int i = 0; i < cardapio.getPizzas().size(); i ++){
                                
                                System.out.println("Nome: "+ cardapio.getPizzas().get(i).getNome()+".");
                                System.out.println("Sabor: " + cardapio.getPizzas().get(i).getSabor()+".");
                                System.out.println("Ingredientes: " +cardapio.getPizzas().get(i).getIngredientes()+".");
                                System.out.println("Tamanho: " +cardapio.getPizzas().get(i).getTamanho()+ " CM.");
                                System.out.println("Preço: R$ " +cardapio.getPizzas().get(i).getPreco()+".");
                                System.out.println("------------------");
                            }
                        }
                        
                        if(cardapio.getBebidas().size() > 0){
                            
                            System.out.println("----- BEBIDAS ----- ");
                            
                            for(int i = 0; i < cardapio.getBebidas().size(); i++){
                                
                            System.out.println("Nome: " +cardapio.getBebidas().get(i).getNome()+ ".");
                            System.out.println("Quantidade: " +cardapio.getBebidas().get(i).getQuant()+ " ML.");
                            System.out.println("Preço: R& " +cardapio.getBebidas().get(i).getPreco()+ ".");
                            System.out.println("------------------");
                            }
                        }
                        
                    }else{
                        System.out.println("Cardapio vazio!");
                    }
                    
                    break;
                    
                case "C":
                    
                    String _opcao;
                    int id;
                    Pedido myPedido = new Pedido();
                    
                    System.out.print("Informe o número da mesa: ");
                    myPedido.setNumMesa(entrada.nextInt());
                    
                    do{
                        entrada.nextLine();
                        
                        System.out.println("|AP| - Adicionar pizza. |AB| - Adicionar bebida. |CP| - Confirmar Pedido |S| - Sair. ");
                        _opcao = entrada.nextLine();
                        
                        if(_opcao.equals("AP")){
                            
                            for(int i = 0; i < cardapio.getPizzas().size(); i++){
                                
                                System.out.println("|-----| " + (i+1) + " |-----|");
                                System.out.println("Nome: "+ cardapio.getPizzas().get(i).getNome()+".");
                                System.out.println("Sabor: " + cardapio.getPizzas().get(i).getSabor()+".");
                                System.out.println("Ingredientes: " +cardapio.getPizzas().get(i).getIngredientes()+".");
                                System.out.println("Tamanho: " +cardapio.getPizzas().get(i).getTamanho()+ " CM.");
                                System.out.println("Preço: R$ " +cardapio.getPizzas().get(i).getPreco()+".");
                                System.out.println("------------------");
                            }
                            
                            System.out.println("Escolha sua pizza: ");
                            id = entrada.nextInt();
                            
                            while(id > cardapio.getPizzas().size() || id < 1){
                                System.out.println("Escolha sua Pizza: ");
                                id = entrada.nextInt();
                            }
                            
                            myPedido.adicionarPizza(cardapio.getPizzas().get(id - 1));
                            System.out.println("PIZZA ADICIONADA COM SUCESSO!");
                            
                        } else if(_opcao.equals("AB")){
                            
                            for(int i = 0; i < cardapio.getBebidas().size(); i++){
                                
                                System.out.println("|-----| " +(i+1)+ " |-----|");
                                System.out.println("Nome: " +cardapio.getBebidas().get(i).getNome()+ ".");
                                System.out.println("Quantidade: " +cardapio.getBebidas().get(i).getQuant()+ " ML.");
                                System.out.println("Preço: R& " +cardapio.getBebidas().get(i).getPreco()+ ".");
                                System.out.println("------------------");
                            }
                            
                            System.out.println("Escolha sua bebida: ");
                            id = entrada.nextInt();
                            
                            while(id > cardapio.getBebidas().size() || id < 1){
                                System.out.println("Escolha sua bebida: ");
                                id = entrada.nextInt();
                            }
                            
                            myPedido.adicionarBebidas(cardapio.getBebidas().get(id - 1));
                            System.out.println("BEBIDA ADICIONADA COM SUCESSO!");
                            
                        } else if(_opcao.equals("CP")){
                            
                            pedidos.add(myPedido);
                            
                            _opcao = "S";
                            
                            System.out.println("PEDIDO CADASTRADO COM SUCESSO!");
                        }
                    }while(!_opcao.equals("S"));
                    
                    break;
                    
                case "LP":
                    
                    String _opcao_ = "P";
                    int indice = 0;
                    
                    while(indice < pedidos.size() && _opcao_.equals("P")){
                        
                        int quant;
                        double  total = 0;
                        boolean repetido;
                        
                        System.out.println("__________*__________");
                        System.out.println("Pedido número: "+(indice+1)+".");
                        
                        for(int j = 0; j < pedidos.get(indice).getPizza().size(); j++){
                            
                            quant = 0;
                            repetido = false;
                            String ultName = pedidos.get(indice).getPizza().get(j).getNome();
                            int ultTamanho = pedidos.get(indice).getPizza().get(j).getTamanho();
                            
                            for(int x = 0; x < pedidos.get(indice).getPizza().size(); x++ ){
                                
                                if(ultName.equals(pedidos.get(indice).getPizza().get(x).getNome()) && ultTamanho == pedidos.get(indice).getPizza().get(x).getTamanho()){
                                    quant++;
                                }
                            }
                            
                            if(j ==0){
                                
                                System.out.println(quant + "x "+ pedidos.get(indice).getPizza().get(j).getNome() + "// Tamanho: " +
                                        pedidos.get(indice).getPizza().get(j).getTamanho() + " CM");
                                
                                total = total + (pedidos.get(indice).getPizza().get(j).getPreco() * quant);
                            }else if( j > 0){
                                
                                for(int y = j-1; y >= 0; y--){
                                    
                                    if(ultName.equals(pedidos.get(indice).getPizza().get(1).getNome()) && ultTamanho == pedidos.get(indice).getPizza().get(1).getTamanho()){
                                        
                                        repetido = true;
                                    }
                                }
                                
                                if(repetido == false){
                                    System.out.println(quant + "x " + pedidos.get(indice).getPizza().get(j).getNome() + " // Tamanho: "
                                            +pedidos.get(indice).getPizza().get(j).getTamanho() + " CM.");
                                    
                                    total = total + (pedidos.get(indice).getPizza().get(j).getPreco() * quant);
                                }    
                            }
                        }
                        quant = 0;
                        
                        for(int j = 0; j < pedidos.get(indice).getBebidas().size(); j++ ){
                            
                            quant = 0;
                            repetido = false;
                            String ultName = pedidos.get(indice).getBebidas().get(j).getNome();
                            int ultTamanho = pedidos.get(indice).getBebidas().get(j).getQuant();
                            
                            for(int x = 0; x < pedidos.get(indice).getBebidas().size(); x++ ){
                                
                                if(ultName.equals(pedidos.get(indice).getBebidas().get(x).getNome()) && ultTamanho == pedidos.get(indice). getBebidas().get(x).getQuant()){
                                    quant++;
                                }
                            }
                            
                            if(j ==0){
                                
                                System.out.println(quant + "x " + pedidos.get(indice).getBebidas().get(j).getNome() + "// Tamanho: " +
                                        pedidos.get(indice).getBebidas().get(j).getQuant() + " ML.");
                                
                                total = total + (pedidos.get(indice).getBebidas().get(j).getPreco() * quant);
                                
                            }else if( j > 0){
                                
                                for(int y = j-1; y >= 0; y--){
                                    
                                    if(ultName.equals(pedidos.get(indice).getBebidas().get(1).getNome()) && ultTamanho == pedidos.get(indice).getBebidas().get(1).getQuant()){
                                        
                                        repetido = true;
                                    }
                                }
                                
                                if(repetido == false){
                                    System.out.println(quant + "x " + pedidos.get(indice).getBebidas().get(j).getNome() + " // Tamanho: "
                                            +pedidos.get(indice).getBebidas().get(j).getQuant() + " CM.");
                                    
                                    total = total + (pedidos.get(indice).getBebidas().get(j).getPreco() * quant);
                                }    
                            }
                        }
                        System.out.println("Este é o total do seu pedido: R$ " +total+".");
                        
                        indice++;
                        
                        System.out.println("|P| - Próximo pedido. |S| - Sair.");
                        _opcao_ = entrada.nextLine();
                    }
                    
                break;
            }
            
        } while(!opcao.equals("S"));
    }
    
}
