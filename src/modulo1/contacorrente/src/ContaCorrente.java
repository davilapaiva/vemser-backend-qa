package modulo1.contacorrente.src;

public class ContaCorrente {

    Cliente cliente;
     String numeroConta;
     int agencia;
     double saldo;
     double chequeEspecial;

     void imprimirContaCorrente() {
        double chequeEspecialDisponivel = 0;

        if (saldo < 0) {
            chequeEspecialDisponivel = chequeEspecial - saldo;
        } else {
            chequeEspecialDisponivel = chequeEspecial;
        }

        System.out.println("Conta corrente: ");
         System.out.println("=".repeat(20));
        System.out.println("Número da conta: " + numeroConta + " Agência: " + agencia);
        System.out.println("Saldo: R$" + String.format("%.2f", saldo) + " Cheque Especial: R$" + String.format("%.2f", chequeEspecialDisponivel));
        System.out.println("");
    }

        boolean sacar(double valor) {
        double saldoCache = retornarSaldoComChequeEspecial();

        if (saldoCache > valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

        boolean depositar(double valor) {
        double saldoAntesDoDeposito = saldo;
        saldo += valor;

        if (saldo == saldoAntesDoDeposito + valor) {
            return true;
        } else {
            return false;
        }
    }

        double retornarSaldoComChequeEspecial() {
        return chequeEspecial + saldo;
    }

         boolean transferir(ContaCorrente contaCorrente, double valor) {
         double saldoRemetente = retornarSaldoComChequeEspecial();

        if (saldoRemetente > valor) {
            contaCorrente.saldo += valor;
            saldo -= valor;

            return true;
        } else {
            return false;
        }
    }
}

