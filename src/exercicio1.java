import java.util.Scanner;

public class exercicio1{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a idade");
        int idade = scanner.nextInt();
        System.out.println(idade + " anos em dias " + idade * 365);
        System.out.println(idade + " anos em meses " + idade * 12);
    }
}