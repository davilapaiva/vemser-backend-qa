package modulo1.lista1;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("Digite o código de cargo do funcionario:");
        int codigo = entradaUsuario.nextInt();
        entradaUsuario.nextLine();
        System.out.println("Digite o salário do funcionario: ");
        float antigoSalario = entradaUsuario.nextFloat();
        entradaUsuario.nextLine();
        String cargo;
        float fator;
        switch (codigo){
            case 101 -> {
                cargo = "Gerente";
                fator = 1.1f;
            }
            case 102 -> {
                cargo = "Engenheiro";
                fator = 1.2f;
            }
            case 103 -> {
                cargo = "Tecnico";
                fator = 1.3f;
            }
            default -> {
                cargo = "Outro";
                fator = 1.4f;
            }
        }
        System.out.println("O funcionário com cargo "+cargo+" recebia antes "+antigoSalario+
                " reais, e depois do aumento receberá "+antigoSalario*fator+" reais, uma diferença de ");
    }
    }
