package br.com.fiap.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente(String titular, int numero, String agencia) {
		super(titular, numero, agencia);
	}

	public ContaCorrente() {
		super();
	}

	public String getTipo() {
		return "Conta Corrente";
	}

	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou	sacar um valor negativo");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		}
		System.out.println("Realizado saque de " + valor);
		this.saldo -= (valor + 0.10);
	}

	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}

}
