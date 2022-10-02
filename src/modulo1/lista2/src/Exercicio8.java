import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int[] vetor = {10, 9, 8, 7, 4, 4, 3, 2, 11, 25};
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o número:");
        int numero = s.nextInt();

        int menorNumero = 0;
        int maiorNumero= 0;
        int contar = 0;
        for(int elemento : vetor){
            if (elemento == numero){
                contar++;
            } else {
                if (elemento > numero){
                    maiorNumero++;
                }else {
                    menorNumero++;
                }
            }
        }
        System.out.println("O número "+numero+ " aparece no vetor "+contar+" vezes");
        System.out.println("O vetor tem "+maiorNumero+" números maiores que o digitado, e "+menorNumero+
                " números menores que o digitado");
    }
}