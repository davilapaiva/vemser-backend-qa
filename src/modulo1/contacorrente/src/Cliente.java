
public class Cliente {
    String nome;
    String cpf;
    Contato[] contatos = new Contato[2];
    Contato contato = new Contato();
    Endereco[] enderecos = new Endereco[2];
    Endereco endereco = new Endereco();

    void imprimirContato() {
        for (int i = 0; i < 2; i++) {
            if (contato != null) {
                contato.imprimirContato();
            }
        }
    }

    void imprimirEndereco() {
        for (int i = 0; i < 2; i++) {
            if (endereco != null) ;
            {
                endereco.imprimirEndereco();
            }
        }
    }

    void imprimirCliente() {
        System.out.println("Nome: " + nome + "\nCPF: " + cpf);

    }
}


