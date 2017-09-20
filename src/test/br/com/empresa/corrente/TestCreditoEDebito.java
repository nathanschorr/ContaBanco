package test.br.com.empresa.corrente;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.java.aula.Conta;

public class TestCreditoEDebito {

	private Conta conta;
	
	@Before
	public void before() {
		conta = new Conta("Nathan", "1-2", "123-4");
	}

	@Test
	public void DadosConta() {
		assertEquals("Nathan", conta.GetTitular());
		assertEquals(0, conta.GetSaldo(), 0);
	}
	
	@Test
	public void CreditoConta() {
		conta.Credito(100);
		assertEquals(100, conta.GetSaldo(), 0);
	}

	@Test
	public void DebitoConta() {
		conta.Credito(100);
		conta.Debito(60);
		assertEquals(40, conta.GetSaldo(), 0);
	}		
}

