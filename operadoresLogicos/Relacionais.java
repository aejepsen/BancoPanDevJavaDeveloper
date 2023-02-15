package operadoresLogicos;

public class Relacionais {

  public static void main(String[] args) {
    int a = 1;
    int b = 2;


    System.out.println(a < b);
    System.out.println(a <= b);
    System.out.println(a > b);
    System.out.println(a >= b);
    System.out.println(a == b);
    System.out.println(a != b);

    String aa = "aa";
    String bb = "bb";

    System.out.println(aa == bb);

    String aaa = "aaa";
    String bbb = new String("aaa");

    System.out.println(aaa.equals(bbb));

    System.out.println(aaa == bbb);
  }
  
}
