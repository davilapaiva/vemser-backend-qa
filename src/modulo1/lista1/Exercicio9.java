package modulo1.lista1;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("Digite a hora de inicio:");
        int horaInicio = entradaUsuario.nextInt();
        entradaUsuario.nextLine();
        System.out.println("Digite o minuto de inicio: ");
        int minutoInicio = entradaUsuario.nextInt();
        entradaUsuario.nextLine();
        System.out.println("Digite a hora de término: ");
        int horaTermino = entradaUsuario.nextInt();
        entradaUsuario.nextLine();
        System.out.println("Digite o minuto de término: ");
        int minutoTermino = entradaUsuario.nextInt();
        entradaUsuario.nextLine();
        int resultadoMinuto = 0;
        int resultadoHora = 0;
        boolean virouDia = false;

        if (minutoInicio > minutoTermino) {
            resultadoMinuto += 60 - minutoInicio;
            minutoInicio = 0;
            horaInicio++;
        }
        if (minutoInicio < minutoTermino) {
            resultadoMinuto += minutoTermino - minutoInicio;
        }
        if (horaInicio > 24) {
            horaInicio -= 24;
            virouDia = true;
        }
        if (horaInicio > horaTermino) {
            resultadoHora += 24 - horaInicio;
            virouDia = true;
            horaInicio = 00;
        }
        if (horaInicio < horaTermino) {
            resultadoHora += horaTermino - horaInicio;
        }
        System.out.println("O jogo acabou depois de  " + resultadoHora + " horas e " + resultadoMinuto + " minutos");
        if (virouDia == true) {
            System.out.println("O jogo virou o dia!!");
        }

    }
}

