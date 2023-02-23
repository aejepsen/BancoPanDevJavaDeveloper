import java.util.Scanner;

public class Ex4ParImpar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
          System.out.println("Digite qtos numeros serão digitados: ");
          int num = sc.nextInt();
          int count = 0;
          int countPar = 0;
          int countImpar = 0;
          
          do {
            System.out.println("Digite um número: ");
            int num2 = sc.nextInt();
            count++;
            if (num2 % 2 == 0) {
                System.out.println("O número é par");
                countPar++;
            } else {
                System.out.println("O número é ímpar");
                countImpar++;
            }
            
            
          } while (count < num);
          System.out.println("Quantidade de números pares: " + countPar);
          System.out.println("Quantidade de números ímpares: " + countImpar);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
    }
  }
}
