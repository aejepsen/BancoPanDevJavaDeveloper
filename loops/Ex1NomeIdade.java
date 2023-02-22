import java.util.Scanner;

// import java.util.Scanner;

public class Ex1NomeIdade {
// faca um programa que leia o nome e a idade de varias pessoas
// pare  o programa inserindo 0

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String nome;
            int idade;

            while(true){
                System.out.println("Digite o nome: ");
                nome = scan.next();
                if (nome.equals("0")) {
                    System.out.println("Programa encerrado");
                    break;
                }else{
                    System.out.println("Digite a idade: ");
                    idade = Integer.parseInt(System.console().readLine());
                    System.out.println("Nome: " + nome + " Idade: " + idade);
                    break;
                }
            }
        }
    }
}
