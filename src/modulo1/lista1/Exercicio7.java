package modulo1.lista1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("Digite o código do produto: ");
        String code = entradaUsuario.nextLine();
        System.out.println("Digite a quantidade comprada: ");
        int quantidade = entradaUsuario.nextInt();
        entradaUsuario.nextLine();
        float resultado = 0f;
        switch (code){
            case "ABCD" -> resultado = 5.30f*quantidade;
            case "XYPK" -> resultado = 6.00f*quantidade;
            case "KLMP" -> resultado = 3.20f*quantidade;
            case "QRST" -> resultado = 2.50f*quantidade;
            default -> System.out.println("Código inválido");
        }
        if (resultado > 0 ){
            System.out.println("O preço total é de: "+resultado+ "reais");
        }

    }
}