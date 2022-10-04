
public class Main {
    public static void main(String[] args) {
        Contato contatosFlor = new Contato();
        contatosFlor.telefone = "11974562312";
        contatosFlor.tipo = 1;
        contatosFlor.descricao = "Contato principal";

        Endereco enderecosFlor = new Endereco();
        enderecosFlor.logradouro = "Avenida Augusto Barbosa Tavares";
        enderecosFlor.numero = 43;
        enderecosFlor.cep = "05790-140";
        enderecosFlor.cidade = "São Paulo";
        enderecosFlor.estado = "Sáo Paulo";
        enderecosFlor.pais = "Brasil";

        Cliente clienteFlor = new Cliente();
        clienteFlor.nome = "Flor Gonzales";
        clienteFlor.cpf = "34621398712";
        clienteFlor.contatos [0] = contatosFlor;
        clienteFlor.enderecos [0] = enderecosFlor;

        ContaCorrente contaCorrenteFlor = new ContaCorrente();
        contaCorrenteFlor.cliente = clienteFlor;
        contaCorrenteFlor.numeroConta = "02512-8";
        contaCorrenteFlor.agencia = 4570;
        contaCorrenteFlor.saldo = 2827.00;
        contaCorrenteFlor.chequeEspecial = 70.00;

        Contato contatosEduardo  = new Contato();
        contatosEduardo.telefone = "11987453215";
        contatosEduardo.tipo = 2;
        contatosEduardo.descricao = "Contato principal";

        Endereco enderecosEduardo = new Endereco();
        enderecosEduardo.logradouro = "Rua Dinamarca";
        enderecosEduardo.numero = 667;
        enderecosEduardo.cep = "12315-090";
        enderecosEduardo.cidade = "Jacareí";
        enderecosEduardo.estado = "São Paulo";
        enderecosEduardo.pais = "Brasil";

        Cliente clienteEduardo = new Cliente();
        clienteEduardo.nome = "Eduardo Silva";
        clienteEduardo.cpf = "467.594.804-15";

        ContaCorrente contaCorrenteEduardo = new ContaCorrente();
        contaCorrenteEduardo.cliente = clienteEduardo;
        contaCorrenteEduardo.numeroConta = "65783-3";
        contaCorrenteEduardo.agencia = 2133;
        contaCorrenteEduardo.saldo = 409.12;
        contaCorrenteEduardo.chequeEspecial = 20;

        contaCorrenteFlor.depositar(250.36);
        contaCorrenteFlor.imprimirContaCorrente();

        contaCorrenteEduardo.sacar(16.00);
        contaCorrenteEduardo.imprimirContaCorrente();

        contaCorrenteFlor.transferir(contaCorrenteEduardo,200);
        contaCorrenteFlor.imprimirContaCorrente();

        System.out.println("\n\nApós todas as operações: ");
        contaCorrenteFlor.imprimirContaCorrente();
        contaCorrenteEduardo.imprimirContaCorrente();



    }
}