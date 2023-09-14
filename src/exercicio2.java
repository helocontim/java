public class exercicio2 {
    public static void main(String[] args) {
        int[] num1 = {8, 9, 7};
        int[] num2 = {4, 5, 6};
        double me1 = calcularMedia(num1);
        double me2 = calcularMedia(num2);
        double SomaDasMedias = me1 + me2;
        double DivisaoTotal = SomaDasMedias / 2;
        System.out.println("A média dos números 8, 9 e 7 é: " + me1);
        System.out.println("A média dos números 4, 5 e 6 é: " + me2);
        System.out.println("A soma das duas médias é: " + SomaDasMedias);
        System.out.println("A divisao total e : " + DivisaoTotal);
            }
    public static double calcularMedia(int[] ns) {
        int soma = 0;
        for (int n : ns) {
            soma += n;
        }
        return (double) soma / ns.length;
    }
}
