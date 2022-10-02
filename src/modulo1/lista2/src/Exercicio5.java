import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        float[][] tabela = new float[5][4];
        String mensagem;
        Scanner s = new Scanner(System.in);
        float nota;
        for (float[] linha : tabela) {
            for (int i = 0; i < 3; i++) {
                switch (i) {
                    case 0 -> mensagem = "o numero da matricula";
                    case 1 -> mensagem = "a media das provas";
                    case 2 -> mensagem = "a media dos trabalhos";
                    default -> mensagem = "a nota final";
                }
                System.out.println("Digite " + mensagem);
                linha[i] = s.nextInt();
            }
        }
        for (float[] linha : tabela) {
            float somaNotas = 0f;
            for (int i = 1; i < 4; i++) {
                switch (i) {
                    case 1 -> somaNotas += linha[i] * 0.6;
                    case 2 -> somaNotas += linha[i] * 0.4;
                    case 3 -> linha[i] = somaNotas;
                }
            }
        }
        float maiorNota = 0;
        float somaNotas = 0;
        float melhorAluno = 0;
        for (int i = 0; i < 5; i++) {
            somaNotas += tabela[i][3];
            if (tabela[i][3] > maiorNota) {
                maiorNota = tabela[i][3];
                melhorAluno = tabela[i][0];
            }
        }
        System.out.printf("o aluno com a maior media final foi %d com a nota %.2f\n", (int)melhorAluno, maiorNota);
        System.out.printf("A media das notas finais foi de %.2f\n", (somaNotas /5));
    }
}