package test.br.com.empresa.corrente;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.java.aula.Conta;

public class TesteConta {

	private Conta conta;
	
	@Before
	public void before() {
		conta = new Conta("Nathan", "1-2", "123-4");
	}

	@Test
	public void test() {
		assertEquals(conta.GetTitular(), "Nathan");
		assertEquals(conta.GetSaldo(), 0, 0);
	}

}
