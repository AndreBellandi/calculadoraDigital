package CalculadoraTeste;

import static org.junit.Assert.*; 
import org.junit.Test; 
import FontesAppCalculadora.Calculadora; 



public class TesteCalculadora {
	//atributos
	private static int contadorTeste = 0;
	private String nomeTeste = "";
	/**
	 * Teste de somar na Calculadora. 
	 */ 

	   @Test 

	   public void testeSomar5com5() { 
		   nomeTeste = "Somar 5 com 5";
		   contadorTeste = contadorTeste + 1;
	       System.out.print("teste: ");
	       System.out.println(contadorTeste);


		   int nro1 = 5; 
	
		   int nro2 = 5; 

	       Calculadora calc= new Calculadora(); 

	       int resultadoEsperado = 10; 

	       int resultadoReal= calc.somar(nro1, nro2);       

	       assertEquals(resultadoEsperado, resultadoReal, 0); 
	       System.out.println(nomeTeste);
	       System.out.print("resultado= ");
	       System.out.println(nomeTeste);
	   } 

	 

	   /** 

	   * Teste de subtrair na  Calculadora. 

	   */ 

	  @Test 

	  public void testeSubtrair3de5() { 


	  int nro1 = 5; 

	  int nro2 = 3; 

	      Calculadora calc = new Calculadora(); 

	      int resultadoEsperado= 2; 

	      int resultadoReal= calc.subtrair(nro1, nro2); 

	      assertEquals(resultadoEsperado, resultadoReal, 0);
	      System.out.println(nomeTeste);
	      System.out.print("resultado= ");
	      System.out.println(nomeTeste);

	  } 

	   

	   /** 

	   * Teste de multiplicar na Calculadora. 

	   */ 

	   @Test 

	   public void testeMultiplicar3por3() { 


	   int nro1 = 3; 

	   int nro2 = 3; 

	       Calculadora calc = new Calculadora(); 

	       int resultadoEsperado = 9; 

	       int resultadoReal = calc.multiplicar(nro1, nro2); 

	       assertEquals(resultadoEsperado, resultadoReal, 0); 

	   } 

	 

	   /** 

	   * Teste de dividir na Calculadora. 

	   */ 

	  @Test 

	  public void testeDividir3por2() { 


	  int nro1 = 3; 

	  int nro2 = 2; 

	      Calculadora calc = new Calculadora(); 

	      int resultadoEsperado= 1; 

	      int resultadoReal = calc.dividir(nro1, nro2); 

	      assertEquals(resultadoEsperado, resultadoReal, 0.1); 

	  } 

	  public void testeDividir3por7() { 


	  int nro1 = 3; 

	  int nro2 = 7; 

	      Calculadora calc = new Calculadora(); 

	      int resultadoEsperado= 0.42857; 

	      int resultadoReal = calc.dividir(nro1, nro2); 

	      assertEquals(resultadoEsperado, resultadoReal, 0.00001); 

	  } 
	     

	} 