import java.util.Scanner;

public class Ex2Notas {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a nota do aluno: ");
            int nota = scanner.nextInt();

            if(nota >= 0 || nota <= 10){
                System.out.println("Nota válida: " + nota);
        }
            while (nota < 0 || nota > 10) {
                System.out.println("Nota inválida, digite novamente: ");
                nota = scanner.nextInt();
            }
        }
    }
}
