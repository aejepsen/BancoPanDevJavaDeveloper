import java.util.Scanner;

public class Ex5Tabuada {
  public static void main(String[] args) {
    
    // for (int i = 1; i <= 10; i++) {
    //   for (int j = 1; j <= 10; j++) {
    //     System.out.println(i + " x " + j + " = " + (i * j));
    //   }
    //   System.out.println("----------");
    // }

    int i = 1;
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Digite um número: ");
      int num = sc.nextInt();
      for (i = 1; i <= 10; i++) {
        System.out.println(num + " x " + i + " = " + (num * i));
      }
    } catch (Exception e) {
      System.out.println("Erro: " + e.getMessage());

    }


  }
}
