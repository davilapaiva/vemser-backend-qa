import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nome = "";
        int contar = 0;
        int somaAltura = 0;
        int maximaAltura = 0;
        String maisVelho = "";
        int maximaIdade  = 0;
        String maisPesado = "";
        float maiorPeso = 0;
        boolean executar = true;
        while (executar){
            System.out.println("Digite o nome do jogador, ou SAIR para fechar o programa :");
            nome = s.nextLine();
            switch (nome){
                case "SAIR" -> {
                    executar = false;
                }
                default -> {
                    System.out.println("Digite a altura do jogador em centimetros:");
                    int atualAltura = s.nextInt();
                    s.nextLine();
                    if (contar == 0 ||  maximaAltura > maiorPeso ){
                        maximaAltura = atualAltura;
                    }
                    somaAltura += atualAltura;
                    System.out.println("Digite a idade do jogador:");
                    int idade = s.nextInt();
                    s.nextLine();
                    if (contar == 0 || idade > maximaIdade ){
                        maximaIdade = idade;
                        maisVelho = nome;
                    }
                    System.out.println("Digite o peso do jogador em quilos:");
                    float weight = s.nextFloat();
                    s.nextLine();
                    if(contar == 0 || weight > maiorPeso){
                        maiorPeso = weight;
                        maisPesado = nome;
                    }
                    contar++;
                }
            }
        }
        if(contar > 0){
            System.out.println("Foram cadastrados "+contar+" jogadores");
            System.out.println("O jogador mais alto tem "+maximaAltura+"cm, e a média de altura é de: "
                    +(somaAltura/contar)+"cm");
            System.out.println("O jogador mais velho é "+maisVelho+" com "+maximaIdade+" anos");
            System.out.println("O jogador mais pesado é "+maisPesado+" com "+maiorPeso+"kg");
        }else {
            System.out.println("Ninguem foi adicionado!");
        }

    }
}




