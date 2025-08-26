package media;

import java.util.Scanner;

public class mediaAluno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do aluno.");
        String nomeAluno = scanner.next();

        System.out.println("Olá, " + nomeAluno);

        System.out.println("Digite uma nota 1!");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite uma nota 2!");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite uma nota 3!");
        double nota3 = scanner.nextDouble();

        System.out.println(nomeAluno + " suas notas são " + nota1 + ", " + nota2 + " e " + nota3);

        double media = (nota1 + nota2 + nota3) /3;

        System.out.println("A nota final do aluno foi " + media);

        if(media >= 7){
            System.out.println("Parabéns, o aluno foi aprovado!");
        } else{
            System.out.println("Aluno de recuperação.");
            
        }

        scanner.close();
    }
    
}
