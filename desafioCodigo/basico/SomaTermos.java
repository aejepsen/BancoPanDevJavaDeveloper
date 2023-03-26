package desafioCodigo.basico;

import java.util.Scanner;

public class SomaTermos {

  public static void main(String[] Args) {

    double h = 0;
    try (Scanner sc = new Scanner(System.in)) {
      double n = sc.nextDouble();

      for (int i = 1; i <= n; i++) {
      //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
      // Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N. 

      h = h + 1.00/i;
      // System.out.println("i=" + i);
      // System.out.println("1/i=" + 1.00/i);
      // System.out.println("h=" + h);
            
       }
      //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
      // System.out.printf("%.2f", h);

      int numArredondado = (int) Math.round(h);

      System.out.println(numArredondado);
    }
      
  }
  
}
