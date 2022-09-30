import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nomeProduto = s.nextLine();
        float valorProduto = s.nextFloat();
        float desconto = 0.05f;

        for (int i = 1; i<=10; i++){
           float valorFinal = ((valorProduto - (valorProduto * (desconto * i))) * i);
            System.out.printf("precoFinal: %.2f\n", valorFinal);
        }

    }
}