public class Exercicio6 {
    public static void main(String[] args) {
        int[][] tabela = {
                {5,5,5,5},
                {4,4,4,4},
                {10,10,10,10},
                {8,8,8,8},
                {9,9,9,9},
        };
        float[] finalNota = {0,0,0,0,0};
        for(int i = 0; i <5; i++ ){
            int somaNota = 0;
            for (int aluno : tabela[i]){
                somaNota+= aluno;
            }
            finalNota[i] = somaNota/4;
        }
        float finalNotaTotal = 0;
        for(float elemento: finalNota){
            finalNotaTotal+=elemento;
        }
        finalNotaTotal/=5;
        System.out.println("A média das disciplinas é:");
        for(int i = 0; i<5; i++){
            System.out.println("Disciplina "+(i+1)+": média ="+finalNota[i]);
        }
        System.out.println(" A média geral das disciplinas é de: "+finalNotaTotal);
    }
}


