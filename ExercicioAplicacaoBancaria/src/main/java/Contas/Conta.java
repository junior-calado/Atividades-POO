package Contas;

import Contas.Enum.TipoTransacao;
import Contas.Interfaces.TransacaoBancaria;

public abstract class Conta implements TransacaoBancaria {
    private String numero;
    private double saldo;

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0.0; // Inicializar saldo como zero
    }

    public double getSaldo() {
        return saldo;
    }

    // Método comum para realizar transações
    public void realizarTransacao(TipoTransacao tipo, double valor) {
        if (tipo == TipoTransacao.DEPOSITO) {
            depositar(valor);
        } else if (tipo == TipoTransacao.SAQUE) {
            sacar(valor);
        } else {
            throw new IllegalArgumentException("Tipo de transação inválido");
        }
    }

    // Remova a declaração de abstração e forneça implementações padrão
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            throw new IllegalArgumentException("Valor de depósito inválido");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            throw new IllegalArgumentException("Valor de saque inválido");
        }
    }
}
