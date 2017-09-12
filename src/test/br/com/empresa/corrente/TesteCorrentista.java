package test.br.com.empresa.corrente;

import static org.junit.Assert.*;

import org.junit.Test;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.java.aula.Correntista;

public class TesteCorrentista {
	private Correntista correntista;
	
	@Before
	public void before() {
		correntista = new Correntista("Nathan", "031.294.980-44");
	}

	@Test
	public void test() {
		assertEquals(correntista.GetNome(), "Nathan");
		assertEquals(correntista.GetCPF(), "031.294.980-44");
	}

}