package desafioCodigo.intermediario;


import java.util.Scanner;

public class Animais {

	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
            String AN1,AN2,AN3;
            
            AN1 = sc.nextLine();
            AN2 = sc.nextLine();
            AN3 = sc.nextLine();
            String x1 = "aguia";
            String x2 = "pomba";
            String x3 = "homem";
            String x4 = "vaca";
            String x5 = "pulga";
            String x6 = "lagarta";
            String x7 = "sanguessuga";
            String x8 = "minhoca";

            //TODO: Implemente as condição necessária para que seja verificado que tipo de animal é:
                   //Dica: Você pode utilizar o método equals para realizar comparações.
                   // se AN1 == "vertebrado" && AN2 == "ave" && AN3 == "carnivoro" então x1

            if (AN1.equals("vertebrado") && AN2.equals("ave") && AN3.equals("carnivoro")) {
                System.out.println(x1);
            }else if (AN1.equals("vertebrado") && AN2.equals("ave") && AN3.equals("onivoro")) {
                System.out.println(x2);
            }else if (AN1.equals("vertebrado") && AN2.equals("mamifero") && AN3.equals("onivoro")) {
                System.out.println(x3);
            }else if (AN1.equals("vertebrado") && AN2.equals("mamifero") && AN3.equals("herbivoro")) {
                System.out.println(x4);
            }else if (AN1.equals("invertebrado") && AN2.equals("inseto") && AN3.equals("hematofago")) {
                System.out.println(x5);
            }else if (AN1.equals("invertebrado") && AN2.equals("inseto") && AN3.equals("herbivoro")) {
                System.out.println(x6);
            }else if (AN1.equals("invertebrado") && AN2.equals("anelideo") && AN3.equals("hematofago")) {
                System.out.println(x7);
            }else if (AN1.equals("invertebrado") && AN2.equals("anelideo") && AN3.equals("onivoro")) {
                System.out.println(x8);
            }
                           
        } 
   
	}
}