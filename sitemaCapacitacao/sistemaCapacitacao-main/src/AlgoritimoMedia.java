import java.util.Scanner;

public class AlgoritimoMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3, n4;
        System.out.println(" Entre com primeira nota ");
        n1 = entrada.nextDouble();
        System.out.println(" Entre com segunda nota ");
        n2 = entrada.nextDouble();
        System.out.println(" Entre com terceira nota ");
        n3 = entrada.nextDouble();
        System.out.println(" Entre com quarta nota ");
        n4 = entrada.nextDouble();
        double media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A media do discrente foi " + media);
        if (media < 5) {
            System.out.println(" aluno reprovado ");
        }
    }

}