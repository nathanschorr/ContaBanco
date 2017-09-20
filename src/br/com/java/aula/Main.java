package br.com.java.aula;

import java.util.Scanner;

public class Main {



		public static void main(String[] args) {
			Banco banco = new Banco("Baninstituto");		
			
			Conta conta = banco.AbreConta();		
			conta.Credito(400);
					
			banco.ImprimeContas();
		}
	}