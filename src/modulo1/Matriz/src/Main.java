public class Main {
    public static void main(String[] args) {
        int[][] Matriz = new int [2][2];
         Matriz[0][0] = 4;
         Matriz[0][1] = 6;
         Matriz[1][0] = 8;
         Matriz[1][1] = 10;

         int somaTotal = Matriz[0][0] + Matriz[0][1] + Matriz[1][0] + Matriz[1][1];

         System.out.println("soma total:" + somaTotal);

         int somaPrimeira = Matriz[0][0] + Matriz[0][1];

         System.out.println("soma primeira linha:" + somaPrimeira);

         int somaSegunda = Matriz[1][0] + Matriz[1][1];

         System.out.println("soma Segunda linha:"+ somaSegunda);

         int divisao = somaPrimeira - somaSegunda;

         System.out.println("divisao da primeira linha com a segunda:" + divisao);

         
    }
}