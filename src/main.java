import java.util.Scanner;

public class main {
    public static void main(String[] args){
        System.out.println("hello and welcome");

        int valor = 10;

        System.out.println(valor);

        byte variavelBYTE = 69;
        System.out.println( " BYTE:" + variavelBYTE );

        short variavelSHORT = 12;
        System.out.println( "SHORT:" + variavelSHORT );

        int variavelINT = 19;
        System.out.println("INT:" + variavelINT );

        long variavelLONG = 21;
        System.out.println("LONG:" + variavelLONG);

        boolean variavelBOOLEAN = false;
        System.out.println("BOOLEAN:"+ variavelBOOLEAN );

        char variavelCHAR = 'W';
        System.out.println("CHAR:" + variavelCHAR );

        float variavelFLOAT = 3.14f;
        System.out.println("FLOAT:" + variavelFLOAT );

        double variavelDOUBLE = 4.9823436;
        System.out.println("DOUBLE:" + variavelDOUBLE);

        int n1 = 1;
        int n2 = 3;
        int conta = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + conta);

        Scanner scanner =  new Scanner(System.in);
        System.out.println("SOMA");
        System.out.println("ESCREVA O PRIMEIRO NUMERO:");
        int numero = scanner.nextInt();
        System.out.println("ESCREVA O SEGUNDO NUMERO:");
        int numero2 = scanner.nextInt();
        int soma = numero + numero2;
        System.out.println( "A soma e igual:" + soma);

        System.out.println("SUBTRAÇÃO");
        System.out.println("ESCREVA O PRIMEIRO NUMERO:");
        int sub = scanner.nextInt();
        System.out.println("ESCREVA O SEGUNDO NUMERO:");
        int sub2 = scanner.nextInt();
        int subtracao = sub - sub2;
        System.out.println( "A subtração e igual:" + subtracao);

        System.out.println("DIVISÃO");
        System.out.println("ESCREVA O PRIMEIRO NUMERO:");
        int div = scanner.nextInt();
        System.out.println("ESCREVA O SEGUNDO NUMERO:");
        int div2 = scanner.nextInt();
        int divisao = div / div2;
        System.out.println( "A divisão e igual:" + divisao);

        System.out.println("MULTIPLICAÇÃO");
        System.out.println("ESCREVA O PRIMEIRO NUMERO:");
        int mult = scanner.nextInt();
        System.out.println("ESCREVA O SEGUNDO NUMERO:");
        int mult2 = scanner.nextInt();
        int multiplicacao = mult * mult2;
        System.out.println( "A multiplicação e igual:" + multiplicacao);

System.out.println("DIGITE UM NUMERO:");
int ImparPar = scanner.nextInt();
if (ImparPar % 2 == 0 ){
    System.out.println(ImparPar + " E PAR");
}else {
    System.out.println(ImparPar + "E IMPAR");
}
        scanner.close();

    }




}
