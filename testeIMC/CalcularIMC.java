package testeIMC;

import java.util.Locale;
import java.util.Scanner;


public class CalcularIMC {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome!");

        String nome = scanner.next();

        System.out.println("Olá," + " " + nome + " " + ",tudo bem?");

        System.out.println("Qual é o seu peso?");

        double peso = scanner.nextDouble();
        String stgPeso = Double.toString(peso);

        System.out.println("Qual é a sua altura?");

        double altura = scanner.nextDouble();
        String stgAltura = Double.toString(altura);

        System.out.println("Seu peso é" + " " + stgPeso + " " + "e sua altura é" + " " + stgAltura);

        scanner.close();

        //Double stgPeso = Double.valueOf(peso);
        //Double stgAltura = Double.valueOf(altura);

        double IMC = peso /(altura * altura);
        

        if(IMC == 18.5){
            System.out.println("Seu IMC é " + IMC + " Sua classificação é de Magreza");
            
        }else if(IMC >= 18.5 && IMC <= 24.9){
            System.out.println("Seu IMC é " + IMC + " Sua Classificação Está Dentro do Normal");
            
        }else if(IMC <= 25.0 && IMC >= 29.9){
            System.out.println("Seu IMC é " + IMC + " Sua Classificação é de Sobrepeso I");
            
        }else if(IMC >= 30.0 && IMC <= 39.9){
            System.out.println("Seu IMC é " + IMC + " Sua Classificação é Obesidade II");

        }else if(IMC >= 40.0){
            System.out.println("Seu IMC é " + IMC + " Sua Classificação é Obesidade Grave III");

        }

    }
    
}
