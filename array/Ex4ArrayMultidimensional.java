package array;

import java.util.Random;

public class Ex4ArrayMultidimensional {
   public static void main(String[] args) {

    Random random = new Random();
    
    int[][] numeros = new int[4][4];
    
 
    for (int i = 0; i < numeros.length; i++) {
      for (int j = 0; j < numeros[i].length; j++) {
        numeros[i][j] = random.nextInt(9);
      }
    }

    System.out.println("Matriz 4x4");
    for (int i = 0; i < numeros.length; i++) {
      for (int j = 0; j < numeros[i].length; j++) {
        System.out.print(numeros[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("-------------");
    System.out.println("Matriz 4x4 com for each");

    for (int[] linha : numeros) {
      for (int numero : linha) {
        System.out.print(numero + " ");
      }
      System.out.println();      
    }


   }
}
