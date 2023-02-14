public class MinhaClasse {

  public static void main(String[] args) {

    final String BR = "Brasil";
    final String ESTADOS_BRASILEIROS = "27";
    final String CAPITAL_BRASILEIRA = "Brasília";
    String meuNome = "Allan";
    int idade = 58;
    float altura = 1.80f;
    boolean verdadeiro = true;
    String nome = "Allan Eric";
    String sobreNome = "Jepsen";
    String nomeCompleto = nomeCompleto(nome, sobreNome);


    System.out.println(ESTADOS_BRASILEIROS);
    System.out.println(CAPITAL_BRASILEIRA);
    System.out.println(BR);
    System.out.println(meuNome);
    System.out.println(idade);
    System.out.println(verdadeiro);
    System.out.println(altura);
    System.out.println(nomeCompleto);

  }

  public static String nomeCompleto(String nome, String sobreNome) {
    return nome + " " + sobreNome;
  }
  
}
