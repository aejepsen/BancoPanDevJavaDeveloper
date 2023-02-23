import java.util.Scanner;

public class Ex5Fatorial {
  
  public static void main(String[] args) {
    
    int i = 1;
    int fat = 1;
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Digite um número: ");
      int num = sc.nextInt();
      // for (i = 1; i <= num; i++) {
      //   fat = fat * i;
      // }
      for ( i = num; i > 1; i--) {
        fat = fat * i;
      }
      System.out.println("Fatorial de " + num + "! = " + fat);
    } catch (Exception e) {
      System.out.println("Erro: " + e.getMessage());
    } finally {
      System.out.println("Fim do programa");
    }
  }
}
