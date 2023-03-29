package desafioCodigo.intermediario;

// import java.io.IOException;
import java.util.Scanner;

public class Triangulo {
  
 

  public static void main(String[] args){
    double A;
    double B;
    double C;
		try (Scanner leitor = new Scanner(System.in)) {
      A = leitor.nextDouble();
      B = leitor.nextDouble();
      C = leitor.nextDouble();
    }
		// double maior;
		// double soma;
    double perimetroTriangulo;
    double areaTrapezio;
		boolean triangulo;
		
// TODO: Implemente a condição necessária para o cálculo do triângulo:
// Dica: Você pode utilizar o String.format() na formatação do texto.
// Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo (soma de todos os lados) e apresente a mensagem:

// Perimetro = XX.X

// Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem:

// Area = XX.X	

    double AB = (double) (A + B);
    double AC = (double) (A + C);
    double BC = (double) (B + C);

    if (A < BC && B < AC && C < AB) {
      triangulo = true;
    }else {
      triangulo = false;
    }
    
    if (triangulo == true) {
      perimetroTriangulo = A + B + C;
      System.out.println("Perimetro = " + String.format("%.1f", perimetroTriangulo));
    }else {
      areaTrapezio = ((A + B) * C) / 2;
      System.out.println("Area = " + String.format("%.1f", areaTrapezio));
    }
		
	}

}
