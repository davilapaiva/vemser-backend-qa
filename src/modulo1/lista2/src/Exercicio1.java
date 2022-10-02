import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String nomeProduto = s.nextLine();
        System.out.println("Digite o valor do produto: ");
        float valorProduto = s.nextFloat();
        float desconto = 0.05f;

        System.out.println("Nome do produto: " + nomeProduto);
        for (int i = 1; i<=10; i++){
           float valorFinal = ((valorProduto - (valorProduto * (desconto * i))) * i);
            System.out.printf("precoFinal: %.2f\n", valorFinal);
        }

    }
}
