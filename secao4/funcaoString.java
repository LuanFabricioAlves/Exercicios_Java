package secao4;

public class funcaoString {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //função 1 converter temperatura
        double  celsius = 25.0;
        double fahrenheit = converteTemperatura(celsius);
        System.out.println("A converção de " + celsius +" C é equivalente à " + fahrenheit + " F");

        //função 2 calcular fatorial
        int numero = 10;
        System.out.println("O fatorial de " + numero + " é " + fatorial(numero));
    }

    //função 1:
    public static double converteTemperatura( double celsius){
        return(celsius * 9/5) + 32;
    }

    //função 2:
    public static int fatorial(int numero){
        if(numero == 0 || numero == 1){
            return 1;
        } else{
            return numero * fatorial(numero -1);
        }
    }
    
}
