package br.com.java.aula;

public class Correntista {
	private String nome;
	private String cpf;
	
	public Correntista(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String GetNome() {
		return this.nome;
	}
	
	public String GetCPF() {
		return this.cpf;
	}
}