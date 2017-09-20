package test.br.com.empresa.corrente;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.rmi.CORBA.Util;

import org.junit.Test;

public class TesteUtil {

	@Test
	public void TestaLeConsole() {
	    String input = "teste";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    String r = Util.LeConsole();	    
	    assertTrue(r.equals("teste"));
	}
}