import java.util.Scanner;

public class Ex3MaiorMedia {
  
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int numero;
      int count = 0;
      int maior = 0;
      int soma = 0;


      do {
        System.out.println("Digite um número: ");
        numero = input.nextInt();

        if (numero > maior) {
          maior = numero;
        }

        soma = soma + numero;
        System.out.println("A soma é: " + soma);
        
        count++;
        System.out.println("O contador é: " + count);
      } while (count < 5);
      
      System.out.println("A média é: " + (soma / (count)));
      System.out.println("O maior número é: " + maior); 
    }  
  }
}
