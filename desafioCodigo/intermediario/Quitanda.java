package desafioCodigo.intermediario;

import java.util.*;

public class Quitanda {
    public static void main(String[] args) {
    
        try (Scanner input = new Scanner(System.in)) {
          int morangos = input.nextInt();
           int macas = input.nextInt();

// Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, 
// conforme a tabela de preços do seu Zé:
// pedido  Morango <= 5 kg => 2.5 /kg
// pedido  Morango >  5 kg => 2.2/kg  
// pedido  Maça    <= 5 kg => 1.8 /kg
// pedido  Maça    >  5 kg => 1.5/kg  

          if (morangos <= 5 && macas <= 5) {
            double preco1 = morangos * 2.5;
            double preco2 = macas * 1.8;
            double precoTotal = preco1 + preco2;
            if (precoTotal > 25 || (morangos + macas) > 8) {
              double precoTotalDesconto = precoTotal - (precoTotal * 0.1);
              System.out.println(precoTotalDesconto);
            } else {
              System.out.println(precoTotal);
            }

          } 
          else if (morangos > 5 && macas > 5) {
            double preco1 = morangos * 2.2;
            double preco2 = macas * 1.5;
            double precoTotal = preco1 + preco2;
            if (precoTotal > 25 || (morangos + macas) > 8) {
              double precoTotalDesconto = precoTotal - (precoTotal * 0.1);
              System.out.println(precoTotalDesconto);
            } else {
              System.out.println(precoTotal);
            }
          }
          else if (morangos <= 5 && macas > 5) {
            double preco1 = morangos * 2.5;
            double preco2 = macas * 1.5;
            double precoTotal = preco1 + preco2;
            if (precoTotal > 25 || (morangos + macas) > 8) {
              double precoTotalDesconto = precoTotal - (precoTotal * 0.1);
              System.out.println(precoTotalDesconto);
            } else {
              System.out.println(precoTotal);
            }
          }
          else if (morangos > 5 && macas <= 5) {
            double preco1 = morangos * 2.2;
            double preco2 = macas * 1.8;
            double precoTotal = preco1 + preco2;
            if (precoTotal > 25 || (morangos + macas) > 8) {
              double precoTotalDesconto = precoTotal - (precoTotal * 0.1);
              System.out.println(precoTotalDesconto);
            } else {
              System.out.println(precoTotal);
            }
          }
       
    }
  }
}