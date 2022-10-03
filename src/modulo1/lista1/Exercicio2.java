package modulo1.lista1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("Selecione o código do estado que deseja:");
        System.out.println("1- São Paulo \n2- Amazonas \n3- Ceará");
        int codigoEstado = entradaUsuario.nextInt();
        int codigoCidade;
        entradaUsuario.nextLine();
        while (codigoEstado > 3 || codigoEstado < 1) {
            System.out.println("Código inválido, digite novamente");
            codigoEstado = entradaUsuario.nextInt();
            entradaUsuario.nextLine();
        }
        String cidade = "";
        float idh = 0f;
        String area = "";
        String populaçao = "";
        String estado = "";
        switch (codigoEstado) {
            case 1 -> {
                estado = "São Paulo";
                System.out.println("Agora escolha o código da cidade, 1 para São Jose dos Campos ou 2 para Diadema.");
                codigoCidade = entradaUsuario.nextInt();
                entradaUsuario.nextLine();
                switch (codigoCidade) {
                    case 1 -> {
                        cidade = "são Jose dos Campos";
                        idh = 0.807f;
                        populaçao = "729.737";
                        area = "1.100";
                    }
                    case 2 -> {
                        cidade = "Diadema";
                        idh = 0.757f;
                        populaçao = "429.550";
                        area = "30.732";
                    }
                }
            }
            case 2 -> {
                estado = "Amazonas";
                System.out.println("Agora escolha o código da cidade, 1 para Manaus ou 2 para Tefé.");
                codigoCidade = entradaUsuario.nextInt();
                entradaUsuario.nextLine();
                switch (codigoCidade) {
                    case 1 -> {
                        cidade = "Manaus";
                        idh = 0.737f;
                        populaçao = "2.219.580";
                        area = "11.401.092";
                    }
                    case 2 -> {
                        cidade = "Tefé";
                        idh = 0.639f;
                        populaçao = "59.547";
                        area = "23.704";
                    }
                }
            }
            case 3 -> {
                estado = "Ceará";
                System.out.println("Agora escolha o código da cidade, 1 para Fortaleza ou 2 para Ibiapina.");
                codigoCidade = entradaUsuario.nextInt();
                entradaUsuario.nextLine();
                switch (codigoCidade) {
                    case 1 -> {
                        cidade = "Fortaleza";
                        idh = 0.754f;
                        populaçao = "2.703.391";
                        area = "312.353";
                    }
                    case 2 -> {
                        cidade = "Ibiapina";
                        idh = 0.646f;
                        populaçao = "25.165";
                        area = "414.902";
                    }
                }
            }
        }
        System.out.println("O estado escolhido foi " + estado);
        System.out.println("A cidade escolhida foi " + cidade + ", ela tem uma população de " + populaçao +
                " habitantes, sua area territorial é de " + area + "km² e o idhm de " + idh);

    }
}

