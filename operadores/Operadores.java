package operadores;

public class Operadores {

  public static void main(String[] args) {

    String nome = "Allan" + ' ' + "Eric";
    String x = 1 + 1 + " " + "Jepsen";
    String y = "jepsen" + " " + 1+1+1;
    String z = "jepsen" + " " + (1+1+1);
    int numero = 0;
    int numero2 = 0;

    numero++;

    System.out.println(numero);
    System.out.println( ++ numero2);
    System.out.println(nome);
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
  }
  
}
