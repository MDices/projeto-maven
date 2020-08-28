package br.gov.sp.fatec.projetomaven;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
   
    /**
     * Rigourous Test :-)
     */
   @Test
	public void testCalculadora()
    {
       calculadora calc = new calculadora(); 
	   assertTrue(calc.soma(1, 1) == 2);
	   assertTrue(calc.subtracao(1, 1) == 0);
	   assertTrue(calc.multiplicacao(1, 1) == 1);
	   assertTrue(calc.divisao(1, 1) == 1);
    }
}
