import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6,7,8,9,10};
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o número:");
        int quantidade = s.nextInt();
        s.nextLine();
        int menorNumero = 0;
        int maiorNumero= 0;
        int contar = 0;
        int numero = 0;
        for(int quantidade : vetor){
            if (quantidade == numero){
                contar++;
            } else {
                if (quantidade > numero){
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