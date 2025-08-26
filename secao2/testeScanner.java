package secao2;
import java.util.Scanner;

public class testeScanner {
    public static void main(String[] args) {

        //1 - testando Scanner.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome");

        String nome = scanner.nextLine();

        System.out.println("Olá" + " " + nome + "!");

        System.out.println("Digite a sua Idade !");

        int idade = scanner.nextInt();
        
        System.out.println("Sua idade é" + " " + idade + "anos !");

        // fechar Scanner
        scanner.close();

        // 2 - Porblemas do nextLine();
        // O bug do nextLine se resolve com um nextLine() extra abaixo da envocação.
        
    }
    
}
