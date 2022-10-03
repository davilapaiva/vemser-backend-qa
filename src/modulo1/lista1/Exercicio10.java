package modulo1.lista1;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitorUsuario = new Scanner(System.in);
        System.out.println("Informe o código do Aluno: ");
        String codigoAluno = leitorUsuario.nextLine();
        System.out.println("Informe a nota obtida na AV1: ");
        double notaAv1 = leitorUsuario.nextDouble();
        leitorUsuario.nextLine();
        System.out.println("Informe a nota obtida na AV2: ");
        double notaAv2 = leitorUsuario.nextDouble();
        leitorUsuario.nextLine();
        System.out.println("Informe a nota obtida na AV3: ");
        double notaAv3 = leitorUsuario.nextDouble();
        leitorUsuario.nextLine();
        System.out.println("Informe a Média dos Exercícios: ");
        double mediaExercicios = leitorUsuario.nextDouble();
        leitorUsuario.nextLine();
        double mediaAproveitamento = 0.0;
        String conceito = "";

        mediaAproveitamento = (notaAv1 + (notaAv2 * 2) + (notaAv3 * 3) + mediaExercicios) / 7;

        if (mediaAproveitamento >= 9.0) {
            conceito = "A";
        }
        if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9.0) {
            conceito = "B";
        }
        if (mediaAproveitamento >= 6.0 && mediaAproveitamento < 7.5) {
            conceito = "C";
        }
        if (mediaAproveitamento >= 4.0 && mediaAproveitamento < 6.0) {
            conceito = "D";
        }
        if (mediaAproveitamento < 4.0) {
            conceito = "E";
        }


    }
}