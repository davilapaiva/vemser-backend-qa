package modulo1.lista1.Exercicio1;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Scanner leitorUsuario = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = leitorUsuario.nextLine();

        System.out.println("Informe sua idade:");
        int idade = leitorUsuario.nextInt();
        leitorUsuario.nextLine();

        System.out.println("Informe sua cidade:");
        String cidade = leitorUsuario.nextLine();

        System.out.println("Informe seu Estado:");
        String estado = leitorUsuario.nextLine();

        System.out.println("Olá! Seu nome é "+nome+",você tem "+idade+"anos, é da cidade de "+cidade+"situada no Estado de "+estado+"");



    }
}