package desafioCodigo.basico;

import java.io.IOException;
import java.util.Scanner;

public class ImprimindoPositivoMedia {

    public static void main(String[] args){
        // double[] numeros = {7, -5, 6, -3.4, 4.6, 12};
            Scanner numeros = new Scanner(System.in);
            double [] num2 = new double[6];
            num2[0] = numeros.nextDouble();
            num2[1] = numeros.nextDouble();
            num2[2] = numeros.nextDouble();
            num2[3] = numeros.nextDouble();
            num2[4] = numeros.nextDouble();
            num2[5] = numeros.nextDouble();

            double somaPositivos = 0;
            int contador = 0;

            for (double p : num2) {
                if (p > 0) {
                    System.out.println(p);
                    somaPositivos += p;
                    contador++;
                }
              
            }
            double media = somaPositivos / contador;
            System.out.println("Soma: " + somaPositivos);
            System.out.println("Quantidade: " + contador);
            System.out.println("Media: " + media);
          }
  }
