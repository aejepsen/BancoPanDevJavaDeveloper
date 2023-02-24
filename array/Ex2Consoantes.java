package array;

import java.util.Scanner;

public class Ex2Consoantes {
  
  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      String[] consoantes = new String[6]; 
      int qtdeConsoantes = 0;
  
      int count = 0;
  
      do {
        System.out.println("Digite uma letra: ");
        String letra = sc.next();
  
        if (!(letra.equalsIgnoreCase("a") || 
        letra.equalsIgnoreCase("e") || 
        letra.equalsIgnoreCase("i") || 
        letra.equalsIgnoreCase("o") || 
        letra.equalsIgnoreCase("u"))) {
          consoantes[count] = letra;
          qtdeConsoantes++;
        }
  
        count++;
      } while (count < consoantes.length);
      System.out.println("Quantidade de consoantes: " + qtdeConsoantes);
      System.out.println("Consoantes: ");
      for (String consoante : consoantes) {
        if (consoante != null){
          System.out.println(consoante);
        }
      }
      // System.out.println(consoantes);
    }


  }
}
