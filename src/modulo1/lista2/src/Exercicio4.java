import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] numeros = new int[20];
        for (int i=0; i <=20; i++){
            System.out.println("Informe um numero:");
            numeros[i] = s.nextInt();
            s.nextLine();
        }
        System.out.println("-------------");
        for (int i = 19; i>= 0; i--)
            System.out.println(numeros[i]);
    }


}