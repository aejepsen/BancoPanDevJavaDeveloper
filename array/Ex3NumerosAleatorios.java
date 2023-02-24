package array;

import java.util.Random;

public class Ex3NumerosAleatorios {
  
  public static void main(String[] args) {
    
    // int[] numeros = new int[20];
    
    // for (int i = 0; i < numeros.length; i++) {
    //   numeros[i] = (int) (Math.random() * 100);
    // }
    
    // for (int i = 0; i < numeros.length; i++) {
    //   System.out.println(numeros[i]+1);
    // }

    Random random = new Random();

    int[] numeros = new int[20];

    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = random.nextInt(100);
    }

    for (int i = 0; i < numeros.length; i++) {
      System.out.println(numeros[i]+1);
      System.out.println(numeros[i]);
    }

  }
}
