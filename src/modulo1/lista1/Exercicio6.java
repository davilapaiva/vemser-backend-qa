package modulo1.lista1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("Digite o numero de eleitores do municipio");
        float eleitores = entradaUsuario.nextInt();
        entradaUsuario.nextLine();
        System.out.println("Digite o numero de votos brancos");
        float brancos = entradaUsuario.nextInt();
        entradaUsuario.nextLine();
        System.out.println("Digite o numero de votos nulos");
        float nulos = entradaUsuario.nextInt();
        entradaUsuario.nextLine();
        System.out.println("Digite o numero de votos validos");
        float validos = entradaUsuario.nextInt();
        entradaUsuario.nextLine();
        float brancosPercentual = (brancos*100/eleitores);
        float nulosPercentual = (nulos*100/eleitores);
        float validosPercentual = (validos*100/eleitores);
        System.out.println("O percentual de votos válidos foi de "+validosPercentual+
                "%\nO percentual de votos nulos foi de "+nulosPercentual+
                "%\nO percentual de votos brancos foi de "+brancosPercentual+'%');
    }
    }
