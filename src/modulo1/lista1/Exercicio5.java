package modulo1.lista1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitorUsuario = new Scanner(System.in);
        System.out.println("Digite o valor da base do retângulo:");
        int base = leitorUsuario.nextInt();
        leitorUsuario.nextLine();
        System.out.println("Digite o valor da altura do retângulo:");
        int altura = leitorUsuario.nextInt();
        leitorUsuario.nextLine();
        System.out.println("O valor da área é de: "+base*altura);
    }
}

