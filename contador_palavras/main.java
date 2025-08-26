import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {

            contarPalavras();

            System.out.println("Deseja continuar? (s/n)");

            continuar =  scanner.nextLine();
            
        }

         System.out.println("Sistema encerrado");

         scanner.close();
        
    }

    public static void contarPalavras(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma Frase!");

        String frase = scanner.nextLine();

        //Transformar a frase em um Array de strings

        String[] palavras = frase.trim().split("//s+");


        //Com a propriedade length, saber quantos elementos existem

        int numeroPalavras = palavras.length;

        System.out.println("A frase contgém: " + numeroPalavras + " palavras");
    }
    
}
