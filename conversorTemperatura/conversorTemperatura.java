package conversorTemperatura;

import java.util.Scanner;

public class conversorTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Saber o que o usuário deseja
        System.out.println("Escolha um tipo de temperatura!");
        System.out.println("1. Celsius para Fhahrenheit");
        System.out.println("2. Fhahrenheit para Celsius");

        int temperatura = scanner.nextInt();

        if(temperatura == 1) {

            //System.out.println("Você escolheu Celsius, C° para F°");
            converterCparaF();

        } else if (temperatura == 2) {

            //System.out.println("Você escolheu Fhahrenheit, F° para C°");
            converterFparaC();
            
        }else{

            System.out.println("Opção inválida");
        }

        scanner.close();

    }

    public static void converterCparaF(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius");
        
        double celsius = scanner.nextDouble();

        double fhahrenheit = (celsius * 9/5) + 32;

        System.out.println("C° convertido é igual a: " + fhahrenheit + " F°");

        scanner.close();
    }

    public static void converterFparaC(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em Fhahrenheit");
        
        double fhahrenheit = scanner.nextDouble();

        double  celsius = (fhahrenheit - 32) / 5/9;

        System.out.println("F° convertido é igual a: " + celsius + " C°");

        scanner.close();
    }
}
