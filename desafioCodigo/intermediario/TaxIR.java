package desafioCodigo.intermediario;

import java.io.IOException;
import java.util.Scanner;

public class TaxIR {

  
  public static void main(String[] args) throws IOException {
  double impostoTotal;
  double renda;
  try (Scanner leitor = new Scanner(System.in)) {
    renda = leitor.nextDouble();
  }
  
if (renda > 4500.00){
  double imposto1 = 1000 * 0.08;
  double imposto2 = 1500 * 0.18;
  double imposto3 = (renda - 4500) * 0.28;
  impostoTotal = imposto1 + imposto2 + imposto3;
  System.out.printf("R$ %.2f" , impostoTotal);
}
if (renda > 3000.00 && renda <= 4500.00){
  double imposto1 = 1000 * 0.08;
  double imposto2 = (renda - 3000) * 0.18;
  impostoTotal = imposto1 + imposto2;
  System.out.printf("R$ %.2f" , impostoTotal);
}
if (renda > 2000.00 && renda <= 3000.00){
  double imposto1 = (renda - 2000) * 0.08;
  impostoTotal = imposto1;
  System.out.printf("R$ %.2f" , impostoTotal);
}
if (renda <= 2000.00){
  impostoTotal = 0;
  System.out.println("Isento");
}

}
}