package secao2;

public class exercicios {
    public static void main(String[] args) {
        //EXERCÍCIO 1: 
        int num = 10;
        int numX2 = num *2;

        System.out.println(numX2);

        //EXERCÍCIO 2:
        char valor = 'B';
        int mudarValor = (int) valor;
        
        System.out.println(mudarValor);

        //EXERCÍCIO 3:
        double num2 = 15.75;
        double num3 = 20.40;
        double soma = num2 + num3;

        System.out.println(soma);

        //EXERCÍCIO 4:
        long nLong = 2_000_000_000L;
        int nConvert = (int) nLong;

        System.out.println(nConvert);

        //EXERCÍCIO 4:
        String frase = "Olá mundo,";
        String BemVindo = "Bem-vindo Java";
        
        String conc = frase + " " + BemVindo;

        System.out.println(conc);
    }
    
}
