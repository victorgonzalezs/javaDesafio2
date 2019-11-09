package br.com.fiap.contas.modelo;

public abstract class Conta {

	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;

	public Conta(String titular, int numero, String agencia) {
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
	}

	public Conta() {
	}

	abstract String getTipo();

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou	depositar um valor negativo");
		}
		System.out.println("Recebido deposito de " + valor + " para " + this.titular + " na conta " + this.numero);
		this.saldo += valor;
	}

	public void saca(double valor) throws SaldoInsuficienteException {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou	sacar um valor negativo");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		}
		System.out.println("Realizado saque de " + valor + " para " + this.titular + " na conta " + this.numero);
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}
}
