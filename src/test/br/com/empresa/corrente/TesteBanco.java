package test.br.com.empresa.corrente;


import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

import br.com.java.aula.Banco;
import br.com.java.aula.Conta;

public class TesteBanco {

	@Test
	public void VerificaNome() {
		Banco banco = new Banco("Banco Teste");
		assertEquals("Banco Teste", banco.GetNome());		
	}

	@Test
	public void VerificaAberturaConta() {
		Banco banco = new Banco("Banco Teste");
		banco.AbreConta("Fulano da Silva", "123", "1234");
		
		Conta conta = banco.GetUltimaContaAberta();
		assertEquals("Fulano da Silva", conta.GetTitular());		
	}
	
	@Test
	public void VerificaUltimaContaAbertaDeBancoSemContas() {
		Banco banco = new Banco("Banco Teste");
		Conta conta = banco.GetUltimaContaAberta();
		assertNull(conta);
	}	
}