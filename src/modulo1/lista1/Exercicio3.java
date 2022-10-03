package modulo1.lista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitorUsuario = new Scanner(System.in);
        System.out.println("Digite a Palavra para traduzir: ");
        String palavra = leitorUsuario.nextLine();
        String resultado = null;
        while (resultado == null){
            switch (palavra){
                case "Cachorro"-> resultado = "Dog";
                case "Dog" -> resultado ="Cachorro";
                case "Tempo" -> resultado = "Time";
                case "Time" -> resultado = "Tempo";
                case "Amor" -> resultado = "Love";
                case "Love" -> resultado = "Amor";
                case "Cidade" -> resultado = "City";
                case "City" -> resultado = "Cidade";
                case "Feliz" -> resultado = "Happy";
                case "Happy" -> resultado = "Feliz";
                case "Triste" -> resultado = "Sad";
                case "Sad" -> resultado = "Triste";
                case "Deveria" -> resultado = "Should";
                case "Should" -> resultado = "Deveria";
                case "Poderia" -> resultado = "Could";
                case "Could" -> resultado = "Poderia";
                default -> {
                    System.out.println("Essa palavra não é valida, por favor digite outra: ");
                    palavra = leitorUsuario.nextLine();
                }
            }
        }
        System.out.println("A tradução da palavra é: "+resultado);
    }
}

