package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.ContaPoupanca;
import br.com.fiap.contas.modelo.SeguroDeVida;

public class TesteDaConta {
	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente("Victor Gonzalez", 85485, "9414");
		ContaPoupanca c2 = new ContaPoupanca("Vinicius", 48484, "8444");
		SeguroDeVida v1 = new SeguroDeVida("Victor Gonzalez", 84555, 10000.00);
		SeguroDeVida v2 = new SeguroDeVida("Viniciusz", 48585, 20000.00);
		c1.deposita(100);
		c2.deposita(100);
		c2.saca(500);
		c1.saca(10);
		c2.saca(5);
//		System.out.println(c1.getSaldo());
//		System.out.println(c2.getSaldo());
		System.out.println(c1.getTipo());
		System.out.println(c2.getTipo());
		System.out.println(v1.getTipo());
		System.out.println(v2.getTipo());
	}
}
