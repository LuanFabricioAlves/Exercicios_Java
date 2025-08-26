package tabuada;

import java.util.Scanner;

public class tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número e veja a tabuada de 0 a 10!");
        
        int numero = scanner.nextInt();

        System.out.println("A tabuda escolhida será a do " + numero + ".");
        scanner.close();

        for(int i = 0; i <= 10; i++){

            int resultado = i * numero;
            System.out.println(i + " X " + numero + " = " + resultado);
        }
        scanner.close();
    
    }
    
}
