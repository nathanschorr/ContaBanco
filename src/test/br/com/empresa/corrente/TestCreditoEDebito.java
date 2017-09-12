package test.br.com.empresa.corrente;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.java.aula.Conta;

public class TestCreditoEDebito {

	private Conta conta;
	
	@Test
	public void CreditoConta() {
		conta = new Conta("Nathan", "1-2", "123-4");
		conta.Credito(50);
		assertEquals(100, conta.GetSaldo(), 0);
	}	
	
	@Test
	public void DebitoConta() {
		conta = new Conta("Nathan", "1-2", "123-4");
		conta.Debito(50);
		assertEquals(0, conta.GetSaldo(), 0);
	}
		
	}


