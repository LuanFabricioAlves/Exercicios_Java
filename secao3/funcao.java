package secao3;

public class funcao {

    public static void main(String[] args) {
         //1 - Criando a primeira função.
        //saudacao();

        //2 - Argumentos
        //soma(3, 9);

        //3 - Retorno
       // System.out.println(doblar(6));

        int numero = 10;
        int doblarNumero = doblar(numero);
        System.out.println("O numero doblado foi " + doblarNumero);

       //4 - Encapsular
       String n1 = verificarPar(numero);
       String n2 = verificarPar(3);

       System.out.println(n1 + n2);



    }
          // static = não precisa instânciar para executar
          //NOME - (ARGS)- {BLOCOS}
          public static void saudacao(){

            System.out.println("Olá, minha primeira função");

          }

          public static void soma(int a, int b){
            int resulado = a + b;
            System.out.println("O resultado é " + resulado);

          }

          public static int doblar(int n){
            return n*2;
          }

          public static String verificarPar(int n){
            if(n % 2 == 0){
                return "O " + n + " é par ";
            }else{
                return "O " + n + " é impar ";
                 }     }
}