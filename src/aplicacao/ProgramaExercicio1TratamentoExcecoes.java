package aplicacao;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import modelo.entidades.ContaBancaria;
import modelo.excecoes.DominioExcecoes;

public class ProgramaExercicio1TratamentoExcecoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Entre os dados da conta:");
			System.out.print("Número da conta:");
			int numeroConta = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome do titular: ");
			String nomeTitular = sc.nextLine();
			System.out.print("Saldo Inicial: ");
			double saldoInicial = sc.nextDouble();
			System.out.print("Limite de saque: ");
			double limiteSaque = sc.nextDouble();
			
			ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldoInicial, limiteSaque);
			
			System.out.print("Entre o valor do saque: ");
			conta.saque(sc.nextDouble());
			System.out.println();
			System.out.println("Saldo Atual: "+ conta.getSaldoInicial());
		}
		catch (DominioExcecoes e) {
			System.out.println("Erro no Saque: "+ e.getMessage());			
		}catch (RuntimeException e) {
			System.out.println("Erro inesperado: " + e.getMessage());
		}
		
		sc.close();

	}

}
