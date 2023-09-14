import java.util.Scanner;

public class exercic3 {
    public static void main(String[] args){
        int gato = 27000000;
        int gato2 = 10000000;
        int conta = gato - gato2;
        System.out.println("Esta e a media de gatos presentes no Brasil: " + gato) ;
        System.out.println("Esta e a quantidade de gatos que vivem nas ruas: " + gato2) ;
        System.out.println("Esta e a quantidades de gatos que vivem em residencias: " + conta) ;

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Escreva quantos gatos de rua encontra na sua semana, assim vamos somar ao final:");
        System.out.println("SABADO:");
        int sabado= scanner.nextInt();
        System.out.println("SEGUNDA-FEIRA:");
        int segunda = scanner.nextInt();
        System.out.println("TERÇA-FEIRA:");
        int terca= scanner.nextInt();
        System.out.println("QUARTA-FEIRA:");
        int quarta= scanner.nextInt();
        System.out.println("QUINTA-FEIRA:");
        int quinta= scanner.nextInt();
        System.out.println("SEXTA-FEIRA:");
        int sexta= scanner.nextInt();
        System.out.println("DOMINGO:");
        int domingo= scanner.nextInt();
        int semana = sabado + segunda + terca + quarta + quinta + sexta + domingo;
        System.out.println( "O total de gatos enconrados foi:" + semana);


    }
}
