package desafioCodigo.intermediario;


import java.util.Scanner;

public class Animais {

	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
            String AN1,AN2,AN3;
            
            AN1 = sc.nextLine();
            AN2 = sc.nextLine();
            AN3 = sc.nextLine();
            String x1 = aguia;
            String x2 = pomba;
            String x3 = homem;
            String x4 = vaca;
            String x5 = pulga;
            String x6 = lagarta;
            String x7 = sanguessuga;
            String x8 = minhoca;

            //TODO: Implemente as condição necessária para que seja verificado que tipo de animal é:
                   //Dica: Você pode utilizar o método equals para realizar comparações.
                   
            if (AN1 == "vertebrado" && AN2 == "ave"){
                if (AN3 == "carnivoro") {
                    System.out.println(x1);
                }else {
                    System.out.println(x2);
                }
            }
            if (AN1 == "vertebrado" && AN2 == "mamifero"){
                if(AN3 == "onivoro"){
                    System.out.println(x3);
                }else {
                    System.out.println(x4);
                }
            } 
            if (AN1 == "invertebrado" && AN2 == "inseto") {
                if (AN3 == "hematofago") {
                    System.out.println(x5);
                }else {
                    System.out.println(x6);
                }
            }
            if (AN1 == "invertebrado" && AN2 == "anelideo") {
                if (AN3 == "hematofago"){
                            System.out.println(x7);
                }else {
                    System.out.println(x8);
                }
            }
        } 
   
	}
}