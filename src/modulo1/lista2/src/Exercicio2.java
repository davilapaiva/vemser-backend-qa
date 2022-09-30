import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Participante1,qual é o numero:");
        int numeroAdvinhar = s.nextInt();
        System.out.println("Participante2, qual é o numero:" );
        int tentativa = s.nextInt();

       while (numeroAdvinhar!= tentativa) {
            if (tentativa < numeroAdvinhar) {
                System.out.println("O numero a ser encontrado é maior do que voce digitou. ");
            }
            else if (tentativa > numeroAdvinhar) {
                System.out.println("O numero a ser encontrado é menor do que voce digitou.");
            }
            System.out.println("Participante2, tente de novo: ");
            tentativa = s.nextInt();

        }

       System.out.println("Você adivinhou!");

    }
}