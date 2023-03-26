package desafioCodigo.basico;

import java.util.*;

public class FabricaCarros {

  public static void main(String[] args) {

    try (Scanner scan = new Scanner(System.in)) {
      int custoFabrica = scan.nextInt();
      int porcentagemDistribuidor = scan.nextInt();
      int PercentualImpostos = scan.nextInt();

    
        int Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;

        int ValorImpostos = (custoFabrica * PercentualImpostos) / 100;
        
        int custoConsumidor = custoFabrica + Distribuidor + ValorImpostos;

        System.out.println(Distribuidor);
        System.out.println(ValorImpostos);
        System.out.println(custoConsumidor);
    }
    System.out.println();
}

}
