package Contas.tipoContas;

import Contas.Conta;
import Exceptions.SalarioException;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String numero) {
        super(numero);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            super.depositar(valor);
        } else {
            throw new SalarioException("Valor de depósito inválido");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0) {
            super.sacar(valor);
        } else {
            throw new SalarioException("Valor de saque inválido");
        }
    }
}
