package modelo.entidades;

import modelo.excecoes.DominioExcecoes;

public class ContaBancaria {
	
	private Integer numeroConta;
	private String titularConta;
	private Double saldoInicial;
	private Double limiteSaque;
	
	public ContaBancaria() {
	}

	public ContaBancaria(Integer numeroConta, 
			String titularConta, Double saldoInicial, 
			Double limiteSaque) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.saldoInicial = saldoInicial;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public Double getSaldoInicial() {
		return saldoInicial;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}
	
	public void  depositar(Double valorDeposito) {
		 saldoInicial += valorDeposito;
	}
	
	public void saque(Double valorSaque) {
		
		if(saldoInicial < valorSaque) {
			throw new DominioExcecoes("Saldo insuficiente");
		}
		else if(valorSaque>limiteSaque) {
			throw new DominioExcecoes("Valor de saque superior "
					+ "que o limite de saque"); 	
		}
		else {
			saldoInicial -= valorSaque;
		}
	}

}
