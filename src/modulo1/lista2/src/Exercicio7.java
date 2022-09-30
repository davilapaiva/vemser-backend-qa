public class Exercicio7 {
    public static void main(String[] args) {
        float tabela[][] = {
                {4,4,4,4,4,4,4,4,4,4},
                {5,5,5,5,5,5,5,5,5,5},
                {6,6,6,6,6,6,6,6,6,6},
        };
        float[] totalValores = {0,0,0};
        float menorValores = 0;
        int melhorMercado = 0;
        for (int i = 0; i < 3; i++) {
            float valorBuffer = 0;
            for (float integrante : tabela[i]) {
                valorBuffer += integrante;
            }
            totalValores[i] = valorBuffer;
            if (i == 0 || valorBuffer < menorValores){
                menorValores = valorBuffer;
                melhorMercado = i+1;
            }
        }
        if (melhorMercado == 0 ){
            System.out.println("ERRO");
        }else {
        }
            System.out.println("O mercado mais barato é o mercado "+ melhorMercado);
            System.out.println(totalValores[0]+" "+totalValores[1]+" "+ totalValores[2]);

    }
}