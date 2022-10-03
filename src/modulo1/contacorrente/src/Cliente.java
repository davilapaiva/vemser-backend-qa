package modulo1.contacorrente.src;

public class Cliente {
    String nome;
    String cpf;
    Contato[] contatos = new Contato[2];
    Endereco[] enderecos = new Endereco[2];

    void imprimirContato() {
        for (int i = 0; i < 2; i++) {
            System.out.println(contatos[i]);
        }
    }
            void imprimirEndereco() {
                for (int i = 0; i < 2; i++) {
                    System.out.println(enderecos[i]);
                }
            }
    void imprimirCliente(){
        System.out.println("Nome: "+nome+"\nCPF: "+cpf);

    }

}
