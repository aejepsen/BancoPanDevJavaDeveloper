package desafioCodigo.intermediario;

import java.util.Scanner;

public class ContaEspacoVogais {

  public static void main(String[] args) {

     try (Scanner sc = new Scanner(System.in)) {

      String str = sc.nextLine();

       String[] strSplit = str.split(" ");

       char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};

       int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

      //  precisa criar um programa que verifica quantos espaços em branco e quantas vogais existem em uma determinada string de entrada que os alunos entregaram na avaliação final. Ajude-o a realizar essa tarefa antes que o tempo para entrega-la no fim do semestre acabe!
      
      for (String item : strSplit) {
        for (char vogal : arrVogais) {
          if (item.toLowerCase().contains(String.valueOf(vogal))) {
            quantVogais++;
          }
        }
      }

  // TODO: Implemente condições (laços) adequados para que possamos contar os espaços em brancos e as vogais que existem na string.
  // Dica: Você pode utilizar o Character.toLowerCase em sua condição:
          
      System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
  }
}
