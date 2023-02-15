package operadores;

public class Condicionais {

  public static void main(String[] args) {

    boolean a = true;
    boolean b = false;

    if (a) {
      System.out.println("a é verdadeiro");
    }

    if (a && b) {
      System.out.println("a e b são verdadeiros");
    } 
    if (a || b) {
      System.out.println("a ou b são verdadeiros");
    }

  }
  
}
