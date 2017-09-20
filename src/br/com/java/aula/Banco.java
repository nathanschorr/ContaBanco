package br.com.java.aula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {

	private String nome;
	public List<Conta> contas = new ArrayList<Conta>();
	
	public Banco(String nome) {
		this.nome = nome;
	}
	
	public String GetNome() {
		return this.nome;
	}
	
	public Conta AbreConta() {
		return this.AbreConta("", "", "");
	}
	
	public Conta AbreConta(String nome, String agencia, String numero) {
		System.out.println("Abertura de conta");								
		
		if (nome.equals("")) {
			System.out.print("Digite o nome do titular: ");
			nome = Util.LeConsole();
		}
		
		if (agencia.equals("")) {
			System.out.print("Digite o número da agência: ");
			agencia = Util.LeConsole();
		}
				
		if (numero.equals("")) {
			System.out.print("Digite o número da conta: ");
			numero = Util.LeConsole();
		}
		
		Conta conta = new Conta(nome, agencia, numero);
		this.contas.add(conta);
		
		return conta;
	}
	
	public void ImprimeContas() {
		for(int i = 0; i < this.contas.size(); i++) {
			this.contas.get(i).ImprimeDados();
		}
	}
	
	public Conta GetUltimaContaAberta() {
		if (this.contas.size() > 0)
			return this.contas.get(this.contas.size()-1);
		else
			return null;
	}

}
		

