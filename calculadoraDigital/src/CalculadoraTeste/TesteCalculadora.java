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


		   double nro1 = 5; 
	
		   double nro2 = 5; 

	       Calculadora calc= new Calculadora(); 

	       double resultadoEsperado = 10; 

	       double resultadoReal= calc.somar(nro1, nro2);       

	       assertEquals(resultadoEsperado, resultadoReal, 0); 
	       System.out.println(nomeTeste);
	       System.out.print("resultado= ");
	       System.out.println(resultadoReal);
	   } 

	 

	   /** 

	   * Teste de subtrair na  Calculadora. 

	   */ 

	  @Test 

	  public void testeSubtrair3de5() { 
		  nomeTeste = "Subtrair 5 com 3";
		  double nro1 = 5; 
	
		  double nro2 = 3; 

	      Calculadora calc = new Calculadora(); 

	      double resultadoEsperado= 2; 

	      double resultadoReal= calc.subtrair(nro1, nro2); 

	      assertEquals(resultadoEsperado, resultadoReal, 0);
	      System.out.println(nomeTeste);
	      System.out.print("resultado= ");
	      System.out.println(resultadoReal);

	  } 

	   

	   /** 

	   * Teste de multiplicar na Calculadora. 

	   */ 

	   @Test 

	   public void testeMultiplicar3por3() { 
		   nomeTeste = "Multiplicar 3 com 5";


		   double nro1 = 3; 
		
		   double nro2 = 3; 

	       Calculadora calc = new Calculadora(); 

	       double resultadoEsperado = 9; 

	       double resultadoReal = calc.multiplicar(nro1, nro2); 

	       assertEquals(resultadoEsperado, resultadoReal, 0); 
	       System.out.println(nomeTeste);
	       System.out.print("resultado= ");
	       System.out.println(resultadoReal);
	   } 

	 

	   /** 

	   * Teste de dividir na Calculadora. 

	   */ 

	  @Test 

	  public void testeDividir3por2() { 
		  nomeTeste = "Dividir 3 com 2";


		  double nro1 = 3; 
	
		  double nro2 = 2; 

	      Calculadora calc = new Calculadora(); 

	      double resultadoEsperado= 1; 

	      double resultadoReal = calc.dividir(nro1, nro2); 

	      assertEquals(resultadoEsperado, resultadoReal, 0.1); 
	      System.out.println(nomeTeste);
	      System.out.print("resultado= ");
	      System.out.println(resultadoReal);
	  } 

	  public void testeDividir3por7() { 
		  nomeTeste = "Dividir 3 com 7";


		  double nro1 = 3; 
	
		  double nro2 = 7; 

	      Calculadora calc = new Calculadora(); 

	      double resultadoEsperado= 0.42857; 

	      double resultadoReal = calc.dividir(nro1, nro2); 

	      assertEquals(resultadoEsperado, resultadoReal, 0.00001);
	      System.out.println(nomeTeste);
	      System.out.print("resultado= ");
	      System.out.println(resultadoReal);

	  } 
	     

	} 