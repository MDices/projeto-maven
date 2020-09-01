package br.gov.sp.fatec.projetomaven;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
   
    
   @Test
	public void testSoma()
    {
       calculadora calc = new calculadora(); 
	   assertTrue(calc.soma(1, 1) == 2);
	
    }
   @Test
   public void testSub()
   {
      calculadora calc = new calculadora(); 
	   assertTrue(calc.subtracao(1, 1) == 1);
   }
   @Test
   public void testMulti()
   {
	   calculadora calc = new calculadora();
	   assertTrue(calc.multiplicacao(1, 1) == 1);
   
   }
   @Test
   public void testDiv() {
	   calculadora calc = new calculadora();
	   assertTrue(calc.divisao(1, 1) == 1);
   }
}
