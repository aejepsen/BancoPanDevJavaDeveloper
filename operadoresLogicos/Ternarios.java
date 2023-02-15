package operadoresLogicos;

public class Ternarios {

  public static void main(String[] args) {

    int x = 10;
    int y = 20;
    int z = 30;

    int maior = x > y ? x : y;
    System.out.println(maior);

    maior = maior > z ? maior : z;
    System.out.println(maior);

    maior = (x > y ? x : y) > z ? (x > y ? x : y) : z;
    System.out.println(maior);
  }
  
}
