package secao2;

import java.util.Scanner;

public class preco {
    
        /**
         * @param args
         */
        public static void main(String[] args) {
    
            //Exercício 1 - verificação de preço
            Scanner scanner = new Scanner(System.in);
            
            //System.out.println("Insira o preço do produto.");
    
            //float preco = scanner.nextFloat();
    
    
            //if (preco < 50) {
               // System.out.println("O produto está barrato :D");
                
           // }else if (preco >= 50 && preco <= 100) {
              //  System.out.println("Valor é médio! :o");
           // } else if (preco >= 100) {
                //System.out.println("Está muito caro. :(");
                
           // }
    
            //Exercício 2 - validar login
    
            //System.out.println("Insira seu nome de Usuário");
            //String usuario = scanner.next();
    
            //System.out.println("Insira sua Senha");
            //String senha = scanner.next();

    
            //if (usuario.equals("admin") && senha.equals("1234")) {

            //System.out.println("Bem-vindo, senha e usuário correto");
            
        //} else {
            //System.out.println("Acesso negado, senha e/ou usuário incorretos");
        //}

        //Exercício 3 - par ou impar.

        //System.out.println("Digite um número");
        //int numero = scanner.nextInt();
        //int resultado = numero%2;

        //if (resultado == 0) {
            //System.out.println("O " + numero + " é PAR!");
            
        //} else{
            //System.out.println("O " + numero + " é IMPAR!");
        //}

        //Exercício 4 - Identificar os dias úteis.
        System.out.println("Insira um número ente 1 e 7");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Sábado, final de semana");
            break;
            case 2:
                System.out.println("Segunda-feira");
            break;
            case 3:
                System.out.println("Terça-feira");
            break;
            case 4:
                System.out.println("Quarta-feira");
            break;
            case 5:
                System.out.println("Quinta-feira");
            break;
            case 6:
                System.out.println("Sexta-feira");
            break;
            case 7:
                System.out.println("Domingo, final de semana");
            break;
        
            default:
                System.out.println("Digite um número entre 1 e 7");
                break;
        }

        scanner.close();
    }

    
}